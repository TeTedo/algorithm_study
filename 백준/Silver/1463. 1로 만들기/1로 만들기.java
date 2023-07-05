import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int num = Integer.parseInt(br.readLine());
            if(num == 1) {
                System.out.println(0);
                return;
            }
            Queue<Integer> queue = new LinkedList<>();
            int[] check = new int[num+1];
            
            queue.offer(num);
            int answer = 0;
            while(!queue.isEmpty()) {
                int n = queue.size();
                answer++;
                for(int i = 0; i < n; i++) {
                    int cur = queue.poll();
                    if(check[cur] == 1) continue;
                    if(cur <= 0) continue;

                    check[cur] = 1;
                    if(cur == 3 || cur == 2) {
                        System.out.println(answer);
                        return;
                    }

                    if(cur % 3 == 0) {
                        queue.offer(cur/3);
                    }

                    if(cur % 2 == 0) {
                        queue.offer(cur/2);
                    }
                    
                    queue.offer(cur-1);

                }
            }
        }
    }

    
}