import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
        ){
            String line;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
            
                bw.write((a+b) + "\n");
            }
            bw.flush();
        }
    }
}