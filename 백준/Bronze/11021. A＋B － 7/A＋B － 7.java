import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            
            int count = Integer.parseInt(br.readLine());
            for(int i = 1; i <= count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                
                bw.write("Case #" + i + ": " + (a+b) + "\n");
            }
            bw.flush();
        }
    }
}