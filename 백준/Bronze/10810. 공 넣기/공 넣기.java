import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            StringTokenizer condition = new StringTokenizer(br.readLine());
            int bucketNumber = Integer.parseInt(condition.nextToken());
            int[] bucket = new int[bucketNumber];
            
            int count = Integer.parseInt(condition.nextToken());
            for(int i = 0; i < count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int ballNum = Integer.parseInt(st.nextToken());
                for(int j = start-1; j < end; j++){
                    bucket[j] = ballNum;
                }
            }
            for(int ball:bucket){
                bw.write(ball + " ");
            }
            bw.flush();    
        } 
    }
}