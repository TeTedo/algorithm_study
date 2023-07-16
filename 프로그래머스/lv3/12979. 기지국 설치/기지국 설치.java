class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int index = 1;
        for(int x : stations) {
            int count = x-w-index < 0 ? 0 : x-w-index;
            answer += count/(2*w+1);
            if(count%(2*w+1) != 0) answer++;
            index = x + w + 1;
        }
        
        if(index <= n) {
            int count = n - index + 1;
            answer += count/(2*w+1);
            if(count%(2*w+1) != 0) answer++;
        }
        return answer;
    }
}