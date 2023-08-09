import java.io.*;
import java.util.*;

class Main{
    
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            char[] str1 = br.readLine().toCharArray();
            char[] str2 = br.readLine().toCharArray();

            int len1 = str1.length;
            int len2 = str2.length;

            int[][] dp = new int[len1+1][len2+1];

            for(int i = 1; i <= str1.length; i++) {
                for(int j = 1; j <= str2.length; j++) {

                    if(str1[i-1] == str2[j-1]) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }

            int answer = dp[len1][len2];
            System.out.println(answer);
        }
    }
}