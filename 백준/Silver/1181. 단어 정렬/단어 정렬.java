import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            PriorityQueue<String> pq = new PriorityQueue<>((a,b)-> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());

            for(int i = 0; i < count; i++) {
                pq.offer(br.readLine());
            }

            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int i = 0; i < count; i++) {
                String x = pq.poll();
                if(hashMap.get(x) == null) {
                    hashMap.put(x, 1);
                    System.out.println(x);
                }
            }

        }
    }
}