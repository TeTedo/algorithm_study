import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int[] used = new int[B.length];
        int start = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = start; j < B.length; j++) {
                if(A[i] >= B[j]) continue;
                if(used[j] == 1) continue;
                used[j] = 1;
                start = j+1;
                answer++;
                break;
            }
        }
        return answer;
    }
}