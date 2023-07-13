import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            ArrayList<Long> arr = new ArrayList<>();
            arr.add(1L);
            arr.add(1L);
            arr.add(1L);
            arr.add(2L);
            arr.add(2L);

            int count = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < count; i++) {
                int num = Integer.parseInt(br.readLine());
                while(arr.size() <= num) {
                    int size = arr.size();
                    arr.add(arr.get(size-2) + arr.get(size-3));
                }
                sb.append(arr.get(num-1));
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}