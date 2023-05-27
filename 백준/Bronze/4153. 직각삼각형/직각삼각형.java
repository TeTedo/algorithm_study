import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String line = "";
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int z = Integer.parseInt(st.nextToken());
                if(x == 0) break;
                
                if(x > y && x > z){
                    if(Math.pow(x,2) == Math.pow(y,2) + Math.pow(z,2)) System.out.println("right");
                    else System.out.println("wrong");
                }
                if(y > x && y > z){
                    if(Math.pow(y,2) == Math.pow(x,2) + Math.pow(z,2)) System.out.println("right");
                    else System.out.println("wrong");
                }
                if(z > y && z > x){
                    if(Math.pow(z,2) == Math.pow(y,2) + Math.pow(x,2)) System.out.println("right");
                    else System.out.println("wrong");
                }                
            }
        }
    }
}