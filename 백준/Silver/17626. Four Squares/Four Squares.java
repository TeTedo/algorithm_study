import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int num = Integer.parseInt(br.readLine());
            int[] dp = new int[num+1];
            dp[1] = 1;

            for(int i = 2; i <= num; i++) {
                int min = Integer.MAX_VALUE;
                for(int j = 1; j*j <= i; j++) {
                    int temp = i - j*j;
                    min = Math.min(min, dp[temp]);
                }
                dp[i] = min + 1;
            }
            
            System.out.println(dp[num]);
        }
    }
}