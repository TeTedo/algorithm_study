import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(token.nextToken());
            int num2 = Integer.parseInt(token.nextToken());

            Map<Integer, Integer> ladder = new HashMap<>();
            Map<Integer, Integer> snake = new HashMap<>();
            for(int i = 0; i < num1; i++) {
                StringTokenizer stt = new StringTokenizer(br.readLine());
                ladder.put(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
            }
            for(int i = 0; i < num2; i++) {
                StringTokenizer stt = new StringTokenizer(br.readLine());
                snake.put(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
            }

            int[] visited = new int[101];
            Queue<Integer> queue = new LinkedList<>();
            visited[1] = 1;
            queue.offer(1);
            int answer = 0;

            while(!queue.isEmpty()) {
                int n = queue.size();
                answer++;
                for(int i = 0; i < n; i++) {
                    int cur = queue.poll();
                    for(int j = 1; j <= 6; j++) {
                        int next = cur + j;
                        if(snake.get(next) != null) next = snake.get(next);;
                        if(ladder.get(next) != null) next = ladder.get(next);
                        if(next >= 100) {
                            System.out.println(answer);
                            return;
                        }
                        if(visited[next] == 1) continue;
                        
                        visited[next] = 1;

                        queue.offer(next);
                    }
                }
            }
        }
    }
}