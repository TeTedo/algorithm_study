import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            int[] dx = {0,1,0,-1};
            int[] dy = {1,0,-1,0};

            for(int i = 0; i < count; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                int nums = Integer.parseInt(st.nextToken());
                int[][] board = new int[N][M];
                int answer = 0;

                for(int j = 0; j < nums; j++) {
                    StringTokenizer tmp = new StringTokenizer(br.readLine());
                    int x = Integer.parseInt(tmp.nextToken());
                    int y = Integer.parseInt(tmp.nextToken());
                    board[x][y] = 1;
                }

                Queue<int[]> queue = new LinkedList<>();
                for(int j = 0; j < N; j++) {
                    for(int k = 0; k < M; k++) {
                        if(board[j][k] == 1) {
                            queue.offer(new int[]{j, k});
                            board[j][k] = 0;
                            while(!queue.isEmpty()) {
                                int[] cur = queue.poll();
                                for(int h = 0; h < 4; h++) {
                                    int nx = cur[0] + dx[h];
                                    int ny = cur[1] + dy[h];
                                    if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                                    if(board[nx][ny] == 1) {
                                        board[nx][ny] = 0;
                                        queue.offer(new int[]{nx, ny});
                                    }
                                }
                            }
                            answer++;
                        }
                    }
                }

                System.out.println(answer);
            }
        }
    }
}