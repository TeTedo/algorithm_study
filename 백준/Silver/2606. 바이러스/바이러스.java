import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int len = Integer.parseInt(br.readLine());
            int count = Integer.parseInt(br.readLine());

            List<List<Integer>> graph = new ArrayList<>();
            for(int i = 0; i < len; i++) {
                graph.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < count; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                graph.get(start-1).add(end-1);
                graph.get(end-1).add(start-1);
            }

            Queue<Integer> queue = new LinkedList<>();
            int[] check = new int[len];
            queue.offer(0);
            int answer = 0;

            while(!queue.isEmpty()) {
                int cur = queue.poll();
                if(check[cur] == 1) continue;
                check[cur] = 1;
                answer++;

                for(int x : graph.get(cur)) {
                    queue.offer(x);
                }
            }

            System.out.println(answer-1);
        }
    }
}