import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            int[] nums = new int[count+1];

            for(int i = 1; i <= count; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(nums);

            int[][] dp = new int[count+1][count+1];
            int answer = 0;

            for(int i = 1; i < dp.length; i++) {
                for(int j = i+1; j < dp.length; j++) {
                    dp[i][j] = 2;
                    int m = nums[j] - nums[i];
                    int k = 0;
                    for(k = i-1; k >= 1; k--) {
                        if(nums[i] - nums[k] == m) break;
                    }

                    dp[i][j] = Math.max(dp[i][j], dp[k][i] + 1);
                    answer = Math.max(answer, dp[i][j]);
                }
            }

            answer = answer == 0 ? 1 : answer;
            System.out.println(answer);
        }
    }
}