import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int number = Integer.parseInt(st.nextToken());
                String[] string = st.nextToken().split("");
                for(int j = 0; j < string.length; j++){
                    bw.write(string[j].repeat(number));    
                }
                bw.write("\n");
            }
            bw.flush();
        }
    }
}