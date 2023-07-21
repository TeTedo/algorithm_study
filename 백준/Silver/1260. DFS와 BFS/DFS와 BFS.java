import java.util.*;
import java.io.*;

class Main{
    static List<List<Integer>> graph;
    static int[] check;
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            for(int i = 0; i <= len; i++) {
                graph.add(new ArrayList<Integer>());
            }

            for(int i = 0; i < count; i++) {
                StringTokenizer nodes = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(nodes.nextToken());
                int second = Integer.parseInt(nodes.nextToken());

                graph.get(first).add(second);
                graph.get(second).add(first);
            }

            for(int i = 1; i <= len; i++) {
                Collections.sort(graph.get(i));
            }
            
            check = new int[len+1];
            StringBuffer sb = new StringBuffer();
            check[start] = 1;
            dfs(start, sb);
            sb.append("\n");
            
            check = new int[len+1];
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(start);
            check[start] = 1;
            while(!queue.isEmpty()) {
                int n = queue.size();
                for(int i = 0; i < n; i++) {
                    int cur = queue.poll();
                    sb.append(cur).append(" ");
                    for(int next : graph.get(cur)) {
                        if(check[next] == 1) continue;
                        check[next] = 1;
                        queue.offer(next);
                    }
                }
            }

            System.out.println(sb);
        }
    }

    private static void dfs(int cur, StringBuffer sb) {
        sb.append(cur).append(" ");
        for(int x : graph.get(cur)) {
            if(check[x] == 1) continue;
            check[x] = 1;
            dfs(x, sb);
        }
    }
}