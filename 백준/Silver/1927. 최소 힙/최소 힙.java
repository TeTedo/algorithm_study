import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);

            for(int i = 0; i < count; i++) {
                int next = Integer.parseInt(br.readLine());
                if(next == 0) {
                    int num;
                    if(pq.size() == 0) num = 0;
                    else num = pq.poll();
                    System.out.println(num);
                    continue;
                }

                pq.offer(next);
            }
        }
    }
}