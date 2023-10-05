import java.io.*;
import java.util.*;

class Main {

    static boolean[] visited;
    static Map<Integer, List<int[]>> graph;
    static int max = 0;
    static int node;

    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer stt;
            
            int count = Integer.parseInt(br.readLine());

            graph = new HashMap<>();
            
            for(int i = 0; i < count; i++) {
                stt = new StringTokenizer(br.readLine());
                int index = Integer.parseInt(stt.nextToken());

                List<int[]> vertex = new ArrayList<>();
                
                while(true) {
                    int newVertex = Integer.parseInt(stt.nextToken());

                    if(newVertex == -1) break;

                    int distance = Integer.parseInt(stt.nextToken());

                    vertex.add(new int[]{newVertex,distance});
                }

                graph.put(index, vertex);
            }

            visited = new boolean[graph.size()+1];
            visited[1] = true;
            dfs(1,0);


            visited = new boolean[graph.size()+1];
            visited[node] = true;
            dfs(node,0);

            System.out.println(max);

          
        }
    }

    public static void dfs(int x, int sum) {

        if(sum > max) {
            max = sum;
            node = x;
        }

        List<int[]> vertex = graph.get(x);

        for(int[] edge : vertex) {
            int next = edge[0];
            int distance = edge[1];

            if(visited[next]) continue;
            visited[next] = true;
            dfs(next, sum+distance);
            visited[next] = false;
        }
    }
}