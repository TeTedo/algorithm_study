import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int num = Integer.parseInt(br.readLine());
            int count = Integer.parseInt(br.readLine());

            int[] destroy = new int[10];
            if(count != 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int i = 0; i < count; i++) {
                    int temp = Integer.parseInt(st.nextToken());
                    destroy[temp] = 1;
                }
            }

            int answer = Math.abs(100 - num);
            if(num == 100) {
                System.out.println(0);
                return;
            }

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);

            int index = 1;
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    int cur = queue.poll();
                    for(int j = 0; j < 10; j++) {
                        if(destroy[j] == 1) continue;
                        if(cur == 0 && j == 0) {
                            answer = Math.min(answer, index + num);
                            continue;
                        }
                        int next = cur == 0 ? j : Integer.parseInt(String.valueOf(cur) + String.valueOf(j));
                        if(next > 999999) continue; 
                        answer = Math.min(answer, index + Math.abs(next-num));
                        queue.offer(next);
                    }
                }
                index++;
            }
            System.out.println(answer);
        }
    }
}