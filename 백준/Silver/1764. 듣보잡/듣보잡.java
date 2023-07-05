import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int noneL = Integer.parseInt(st.nextToken());
            int noneS = Integer.parseInt(st.nextToken());

            HashMap<String, Boolean> hashMap = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();

            for(int i = 0; i < noneL; i++) {
                String string = br.readLine();
                hashMap.put(string, true);
            }

            for(int i = 0; i < noneS; i++) {
                String string = br.readLine();
                if(hashMap.get(string) != null) {
                    list.add(string);
                }
            }

            Collections.sort(list);
            System.out.println(list.size());
            for(String x : list) {
                System.out.println(x);
            }
        }
    }
}