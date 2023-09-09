import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a-b);
        for(int x : scoville){
            pq.offer(x);
        }

        while(pq.peek() < K) {
            if(pq.size() < 2) return -1;
            int a = pq.poll();
            int b = pq.poll();
            
            int c = a + b * 2;
            pq.offer(c);
            answer++;
        }
        return answer;
    }
}