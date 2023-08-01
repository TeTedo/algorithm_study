import java.io.*;
import java.util.*;

class Main{

    public static int[][] painting;
    public static int[][] visited;
    public static int[] dx;
    public static int[] dy;
    public static int normal;
    public static int blind;
    public static int count;

    public static void main(String[] args) throws IOException{
        
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            count = Integer.parseInt(br.readLine());

            normal = 0;
            blind = 0;
            dx = new int[]{0,0,1,-1};
            dy = new int[]{1,-1,0,0};

            StringBuffer sb = new StringBuffer();

            // R = 0, G = 1, B = 2
            painting = new int[count][count];
            for(int i = 0; i < count; i++) {
                String line = br.readLine();
                for(int j = 0; j < count; j++) {
                    char color = line.charAt(j);
                    if(color == 'R') painting[i][j] = 0;
                    if(color == 'G') painting[i][j] = 1;
                    if(color == 'B') painting[i][j] = 2;
                }
            }

            visited = new int[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    if(visited[i][j] == 1) continue;
                    normal++;
                    dfs(i,j);
                }
            }

            visited = new int[count][count];
            
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    if(painting[i][j] == 1) painting[i][j] = 0;
                }
            }
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    if(visited[i][j] == 1) continue;
                    blind++;
                    dfs(i,j);
                }
            }
            sb.append(normal).append(" ").append(blind);
            System.out.println(sb);
        }
    }

    public static void dfs(int x, int y){
        visited[x][y] = 1;
        int cur = painting[x][y];
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx < 0 || ny < 0 || nx >= count || ny >= count) continue;
            if(cur != painting[nx][ny] || visited[nx][ny] == 1) continue;
            dfs(nx, ny);
        }
    }
}