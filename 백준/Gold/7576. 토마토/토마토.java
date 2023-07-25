import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stt.nextToken());
            int y = Integer.parseInt(stt.nextToken());

            int[][] board = new int[x][y];
            Queue<int[]> queue = new LinkedList<>();
            for(int j = 0; j < y; j++) {
                StringTokenizer tomato = new StringTokenizer(br.readLine());
                for(int k = 0; k < x; k++) {
                    board[k][j] = Integer.parseInt(tomato.nextToken());
                    if(board[k][j] == 1) {
                        queue.offer(new int[]{k,j});
                    }
                }
            }

            int[] dx = new int[]{1,-1,0,0};
            int[] dy = new int[]{0,0,1,-1};

            int answer = -1;
            while(!queue.isEmpty()) {
                answer++;
                int n = queue.size();
                for(int i = 0; i < n; i++) {
                    int[] cur = queue.poll();
                    for(int j = 0; j < 4; j++) {
                        int nx = cur[0] + dx[j];
                        int ny = cur[1] + dy[j];

                        if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;
                        if(board[nx][ny] != 0) continue;

                        board[nx][ny] = 1;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }

            
            for(int j = 0; j < y; j++) {
                for(int k = 0; k < x; k++) {
                    if(board[k][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}