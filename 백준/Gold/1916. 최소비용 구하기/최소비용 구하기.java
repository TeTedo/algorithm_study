import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    public int end;
    public int cost;

    public Node(int end, int cost) {
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}
class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int len = Integer.parseInt(br.readLine());
            List<List<Node>> graph = new ArrayList<>();
            for(int i = 0; i <= len; i++) {
                graph.add(new ArrayList<Node>());
            }

            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++) {
                StringTokenizer stt = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(stt.nextToken());
                int end = Integer.parseInt(stt.nextToken());
                int cost = Integer.parseInt(stt.nextToken());

                graph.get(start).add(new Node(end, cost));
            }

            StringTokenizer stt2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stt2.nextToken());
            int end = Integer.parseInt(stt2.nextToken());

            PriorityQueue<Node> queue = new PriorityQueue<>();
            queue.offer(new Node(start,0));

            int[] costs = new int[len+1];
            Arrays.fill(costs, Integer.MAX_VALUE);
            costs[start] = 0;

            int[] check = new int[len+1];   

            while(!queue.isEmpty()) {
                Node cur = queue.poll();
                if(check[cur.end] == 1) continue;
                check[cur.end] = 1;
                for(Node info : graph.get(cur.end)) {
                    int cost = costs[cur.end] + info.cost;
                    int next = info.end;

                    if(cost >= costs[next]) continue;

                    costs[next] = cost;
                    if(next == end) continue;

                    queue.offer(new Node(next, cost));
                }
            }
            System.out.println(costs[end]);
        }
    }
}