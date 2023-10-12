import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

class Main {

    public static int N;
    public static boolean[] visited;
    public static List<List<Node>> graph;
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            N = Integer.parseInt(br.readLine());
            
            graph = new ArrayList<>();
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            String line;
            StringTokenizer stt;
            while((line = br.readLine()) != null) {
                stt = new StringTokenizer(line);
                int parent = Integer.parseInt(stt.nextToken());
                int child = Integer.parseInt(stt.nextToken());
                int weight = Integer.parseInt(stt.nextToken());

                graph.get(parent).add(new Node(child, weight));
                graph.get(child).add(new Node(parent, weight));
            }

            visited = new boolean[N+1];
            int start = find(1)[1];

            visited = new boolean[N+1];
            int result = find(start)[0];

            System.out.println(result);

            
        }
    }

    static public int[] find(int start) {
        int[] dist = new int[N+1];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(start, 0));

        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(visited[cur.end]) continue;
            visited[cur.end] = true;

            for(Node next : graph.get(cur.end)) {
                if(visited[next.end]) continue;
                if(dist[next.end] >= dist[cur.end] + next.weight) continue;
                dist[next.end] = dist[cur.end] + next.weight;
                queue.offer(new Node(next.end, dist[next.end]));
            }
        }

        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 1; i < dist.length; i++) {
            if(max < dist[i]) {
                max = dist[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
}