import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int end;
    int weight;

    Node(int a, int b) {
        end = a;
        weight = b;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

class Main{

    static int[] dist;
    static boolean[] checked;
    static int N;
    static List<List<Node>> graph;
    static int INF = 200000000;

    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer stt;
            stt = new StringTokenizer(br.readLine());

            N = Integer.parseInt(stt.nextToken());
            int E = Integer.parseInt(stt.nextToken());

            graph = new ArrayList<>();

            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            for(int i = 1; i <= E; i++) {
                stt = new StringTokenizer(br.readLine());

                int start = Integer.parseInt(stt.nextToken());
                int end = Integer.parseInt(stt.nextToken());
                int weight = Integer.parseInt(stt.nextToken());

                graph.get(start).add(new Node(end, weight));
                graph.get(end).add(new Node(start, weight));
            }

            stt = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(stt.nextToken());
            int v2 = Integer.parseInt(stt.nextToken());

            int result1= 0;
            result1 += daijkstra(1,v1);
            result1 += daijkstra(v1,v2);
            result1 += daijkstra(v2,N);

            int result2 = 0;
            result2 += daijkstra(1,v2);
            result2 += daijkstra(v2,v1);
            result2 += daijkstra(v1,N);

            int result = result1 >= INF && result2 >= INF ? -1 : Math.min(result1, result2);
            
            System.out.println(result);
        }
    }

    static int daijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        dist = new int[N+1];
        checked = new boolean[N+1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        while(!pq.isEmpty()) {
            Node cur = pq.poll();
            
            if(checked[cur.end]) continue;
            checked[cur.end] = true;

            for(Node node : graph.get(cur.end)) {
                int next = node.end;
                if(!checked[next] && dist[next] > dist[cur.end] + node.weight) {
                    dist[next] = cur.weight + node.weight;
                    pq.offer(new Node(next, dist[next]));
                }
            }
        }

        return dist[end];

    }
}