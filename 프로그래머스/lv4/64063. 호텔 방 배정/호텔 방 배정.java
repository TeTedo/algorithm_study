import java.util.*;

class Solution {
    public long[] solution(long k, long[] room_number) {
        int len = room_number.length;
        long[] answer = new long[len];
        HashMap<Long,Long> rooms = new HashMap<>();
        Queue<Long> queue = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            long next = room_number[i];
            long j = next;
            queue.offer(j);
            while(rooms.get(j) != null) {
                j = rooms.get(j);
                queue.offer(j);
            }
            
            while(!queue.isEmpty()) {
                rooms.put(queue.poll(), j+1);
            }
            answer[i] = j;
        }
        
        
        return answer;
    }
}