import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int len = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            int[] pipe = new int[len + 1];

            for(int i = 0; i < count; i++) {
                StringTokenizer next = new StringTokenizer(br.readLine());
                int nextLen = Integer.parseInt(next.nextToken());
                int capacity = Integer.parseInt(next.nextToken());

                for(int j = len; j > nextLen; j--) {
                    if(pipe[j - nextLen] == 0) continue;
                    pipe[j] = Math.max(pipe[j], Math.min(pipe[j - nextLen], capacity));
                }
                pipe[nextLen] = Math.max(pipe[nextLen], capacity);
            }

            System.out.println(pipe[len]);
        }
    }
}