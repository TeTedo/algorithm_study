import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] visited = new int[n+1][m+1];
        for(int i = 0; i < puddles.length; i++) {
            visited[puddles[i][1]][puddles[i][0]] = 1;
        }
        
        int[][] dp = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(i == 1 && j == 1) continue;
                if(visited[i][j] == 1) continue;
                dp[i][j] = dp[i][j-1]%1000000007 + dp[i-1][j]%1000000007;
            }
        }
        return dp[n][m]%1000000007;
    }
}