import java.io.*;
import java.util.*;

// bfs로 최댓값 구한다.
// 최적화 - arr 배열에 담을때 최대로 나올수 있는 경우를 구한다.
// bfs로 돌면서 최댓값이랑 같으면 바로 출력

class Main{
    public static int answer = Integer.MIN_VALUE;
    public static int[][] visited;
    public static int[] dx = new int[]{0,1,0,-1};
    public static int[] dy = new int[]{1,0,-1,0};
    public static int[][] arr;
    public static int mx;
    public static int my;
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer stt = new StringTokenizer(br.readLine());
            mx = Integer.parseInt(stt.nextToken());
            my = Integer.parseInt(stt.nextToken());
            visited = new int[mx][my];
            arr = new int[mx][my];
            
            for(int i = 0; i < mx; i++) {
                StringTokenizer stt2 = new StringTokenizer(br.readLine());
                for(int j = 0; j < my; j++) {
                    int cur = Integer.parseInt(stt2.nextToken());
                    arr[i][j] = cur;
                }
            }

            
            for(int i = 0; i < mx; i++) {
                for(int j = 0; j < my; j++) {
                    visited[i][j] = 1;
                    dfs(i,j,arr[i][j], 1);
                    visited[i][j] = 0;
                }
            }
            System.out.println(answer);
        }
    }

    public static void dfs(int x, int y, int sum, int D) {
        if(D == 4) answer = Math.max(answer, sum);
        else {
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= mx || ny >= my) continue;
                if(visited[nx][ny] == 1) continue;
                if(D == 2) {
                    visited[nx][ny] = 1;
                    dfs(x,y, sum + arr[nx][ny], D+1);
                    visited[nx][ny] = 0;  
                }
                visited[nx][ny] = 1;
                dfs(nx,ny, sum + arr[nx][ny], D+1);
                visited[nx][ny] = 0;  
            }
        }
    }
}