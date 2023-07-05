import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int book = Integer.parseInt(st.nextToken());
            int problem = Integer.parseInt(st.nextToken());

            HashMap<String, String> changeMap = new HashMap<>();

            for(int i = 0; i < book; i++) {
                String poketmon = br.readLine();
                changeMap.put(poketmon, Integer.toString(i+1));
                changeMap.put(Integer.toString(i+1), poketmon);
            }

            for(int i = 0; i < problem; i++) {
                String str = br.readLine();
                System.out.println(changeMap.get(str));
            }
        }
    }
}