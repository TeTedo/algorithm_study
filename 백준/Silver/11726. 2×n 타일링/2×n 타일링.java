import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int num = Integer.parseInt(br.readLine());

            int[] dp = new int[1001];
            dp[1] = 1;
            dp[2] = 2;
            for(int i = 3; i <= num; i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 10007;
            }
            System.out.println(dp[num]);
        }
    }
}