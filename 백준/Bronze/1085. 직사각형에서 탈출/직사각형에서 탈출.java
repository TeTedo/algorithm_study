import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            
            int dx = Math.abs(w-x);
            int minX = Math.min(x,dx);
            int dy = Math.abs(h-y);
            int minY = Math.min(y,dy);
            
            int min = Math.min(minX,minY);
            System.out.println(min);
        }
    }
}