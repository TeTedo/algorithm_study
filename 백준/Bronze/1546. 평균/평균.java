import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            double count = Integer.parseInt(br.readLine());
            double sum = 0;
            double maxNum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < count; i++){
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                maxNum = Math.max(maxNum,score);
            }
            System.out.print((sum/maxNum)*100/count);
        }
    }
}