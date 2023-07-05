import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            HashMap<String, String> hashMap = new HashMap<>();

            for(int i = 0; i < N; i++) {
                StringTokenizer string = new StringTokenizer(br.readLine());
                hashMap.put(string.nextToken(), string.nextToken());
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < M; i++) {
                String string = br.readLine();
                sb.append(hashMap.get(string) + "\n");
            }

            System.out.println(sb);
        }
    }

    
}