import java.util.*;

class Solution {
    int[] arr;
    int answer;
    int n;
    String[] bracket = new String[]{"(",")"};
    
    public int solution(int n) {
        answer = 0;
        this.n = n;
        Stack<String> stack = new Stack<>();
        
        dfs(0,stack);
        
        return answer;
    }
    
    public void dfs(int D, Stack stack) {
        if(D == n * 2) {
            if(stack.size() == 0) answer++;
        }
        else {
            for(int i = 0; i < 2; i++) {
                Stack temp = (Stack)stack.clone();
                
                if(i == 0) temp.push(bracket[i]);
                if(i == 1 && temp.size() > 0 && temp.peek().equals("(")) temp.pop();
                if(stack.size() != temp.size()) dfs(D+1, temp);
            }
        }
    }
}