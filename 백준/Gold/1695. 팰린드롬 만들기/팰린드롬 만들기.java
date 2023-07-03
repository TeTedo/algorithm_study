import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[count+1];
            for(int i = 1; i <= count; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[count+1][count+1];

            for(int i = 1; i < dp.length; i++) {
                for(int j = 1; j < dp.length - i; j++) {
                    if(nums[j] == nums[j+i]) {
                        dp[j][j+i] = dp[j+1][j+i-1];
                    } else {
                        dp[j][j+i] = Math.min(dp[j][j+i-1], dp[j+1][j+i]) + 1;
                    }
                }
            }

            System.out.println(dp[1][count]);
        }
    }
}