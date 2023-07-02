import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            int[][] scores = new int[count][2];
            for(int i = 0; i < count; i++) {
                int score = Integer.parseInt(br.readLine());
                scores[i][0] = score;
                scores[i][1] = score;
                if(i - 1 < 0) continue;
                scores[i][0] = scores[i-1][1] + score;
                if(i - 2 < 0) continue;
                scores[i][1] = Math.max(scores[i-2][0] + score, scores[i-2][1] + score);
            }
            System.out.println(Math.max(scores[count-1][0],scores[count-1][1]));
        }
    }
}