import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer stt;
            stt = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(stt.nextToken());
            int E = Integer.parseInt(stt.nextToken());

            int start = Integer.parseInt(br.readLine());
            int[] dist = new int[V+1];
            Arrays.fill(dist, Integer.MAX_VALUE);
            boolean[] visited = new boolean[V+1];
            
            List<List<Node>> graph = new ArrayList<>();
            for(int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }
            
            String line;
            while((line = br.readLine()) != null) {
                stt = new StringTokenizer(line);
                int u = Integer.parseInt(stt.nextToken());    
                int v = Integer.parseInt(stt.nextToken());
                int w = Integer.parseInt(stt.nextToken());

                graph.get(u).add(new Node(v, w));
            }

            PriorityQueue<Node> pq = new PriorityQueue<>();
            pq.offer(new Node(start, 0));
            dist[start] = 0;
            
            while(!pq.isEmpty()) {
                Node cur = pq.poll();
                if(visited[cur.end]) continue;
                visited[cur.end] = true;
                for(Node next : graph.get(cur.end)) {
                    if(visited[next.end]) continue;
                    if(dist[next.end] < dist[cur.end] + next.weight) continue;
                    
                    dist[next.end] = dist[cur.end] + next.weight;
                    pq.offer(new Node(next.end, dist[next.end]));
                }
            }

            for(int i = 1; i < dist.length; i++) {
                if(dist[i] == Integer.MAX_VALUE) {
                    System.out.println("INF");
                }else {
                    System.out.println(dist[i]);
                }
            }
            
        }
    }
}