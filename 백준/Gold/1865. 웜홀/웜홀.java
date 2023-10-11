import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int end;
    int time;

    public Node(int end, int time) {
        this.end = end;
        this.time = time;
    }

    @Override
    public int compareTo(Node o) {
        return time - o.time;
    }
}

class Main{
    static int N;
    static List<List<Node>> graph;
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int TC = Integer.parseInt(br.readLine());
            StringTokenizer stt;
            for(int i = 0; i < TC; i++) {
                stt = new StringTokenizer(br.readLine());

                N = Integer.parseInt(stt.nextToken());
                int M = Integer.parseInt(stt.nextToken());
                int W = Integer.parseInt(stt.nextToken());

                graph = new ArrayList<>();
                for(int j = 0; j <= N; j++) {
                    graph.add(new ArrayList<>());    
                }
                
                for(int j = 0; j < M; j++) {
                    stt = new StringTokenizer(br.readLine());
                    int S = Integer.parseInt(stt.nextToken());
                    int E = Integer.parseInt(stt.nextToken());
                    int T = Integer.parseInt(stt.nextToken());

                    graph.get(S).add(new Node(E, T));
                    graph.get(E).add(new Node(S, T));
                }

                for(int j = 0; j < W; j++) {
                    stt = new StringTokenizer(br.readLine());
                    int S = Integer.parseInt(stt.nextToken());
                    int E = Integer.parseInt(stt.nextToken());
                    int T = Integer.parseInt(stt.nextToken());

                    graph.get(S).add(new Node(E, T*-1));
                }

                if(bellmanFord()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static boolean bellmanFord() {
        int[] dist = new int[N+1];
        boolean update = false;

        for(int i = 1; i <= N; i++) {
            update = false;
            for(int j = 1; j <= N; j++) {
                for(Node next : graph.get(j)) {
                    if(dist[next.end] <= dist[j] + next.time) continue;
                    dist[next.end] = dist[j] + next.time;
                    update = true;
                }
            }
            if(!update) return update;
        }
        return update;
    }
}