import java.io.*;
import java.util.*;

class Main{

    public static class Node{
        int x;
        int time;

        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            if(N >= K) {
                System.out.println(N-K);
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            boolean[] visited = new boolean[100001];

            queue.offer(new Node(N, 0));

            int answer = Integer.MAX_VALUE;

            while(!queue.isEmpty()) {
                Node cur = queue.poll();

                visited[cur.x] = true;
                if(cur.x == K) answer = Math.min(answer,cur.time);

                if(cur.x * 2 < 100001 && !visited[cur.x * 2]) queue.offer(new Node(cur.x * 2, cur.time));
                if(cur.x + 1 < 100001 && !visited[cur.x + 1]) queue.offer(new Node(cur.x + 1, cur.time+1));
                if(cur.x - 1 >= 0 && !visited[cur.x - 1]) queue.offer(new Node(cur.x - 1, cur.time+1));
            }

            System.out.println(answer);
        }
    }
}