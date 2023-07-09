import java.util.*;

class Solution {
    int answer;
    int n;
    
    public int solution(int n) {
        answer = 0;
        this.n = n;
        
        dfs(0,0);
        
        return answer;
    }
    
    public void dfs(int D, int cur) {
        if(D == n * 2) {
            if(cur == 0) answer++;
        }
        else {
            dfs(D+1, cur+1);
            if(cur > 0) dfs(D+1, cur-1);
        }
    }
}