import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] pieces = {1, 1, 2, 2, 2, 8};
            
            for(int piece: pieces){
                int have = Integer.parseInt(st.nextToken());
                if(have == piece) bw.write("0 ");
                else bw.write(piece-have + " ");
            }
            
            bw.flush();
        }
    }
}