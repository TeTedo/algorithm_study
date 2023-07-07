import java.util.*;

class Solution {
    public int solution(int[] food_times, long k) {
        int len = food_times.length;
        int[][] foods = new int[len][2];
        for(int i = 0; i < len; i++) {
            foods[i] = new int[]{food_times[i], i};
        }
        Arrays.sort(foods, (a,b)-> a[0] - b[0]);
        
        long sum = 0L;
        int prev = 0;
        int[] check = new int[len];
        
        for(int i = 0; i < foods.length; i++) {
            long rest = foods[i][0] - prev;
            if(sum + rest * len <= k) {
                prev = foods[i][0];
                sum += rest * len;
                len--;
                check[foods[i][1]] = 1;
            } else {
                long index = (k - sum) % len;
                for(int j = 0; j < check.length; j++) {
                    if(check[j] == 1) continue;
                    if(index == 0L) return j+1;
                    index--;
                }
            }
        }
        return -1;
    }
}