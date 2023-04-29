class Solution {
    public int solution(int n, int m, int[] section) {
        int[] wholeSection = new int[n+m];
        int count = 0;
        for(int i = 0; i < section.length; i++){
            int index = section[i]-1;
            // 벽에 안칠해져 있는 경우 롤러 길이(m)만큼 칠하기
            if(wholeSection[index] == 0){
                count++;
                for(int j = index; j < index+m; j++){
                    wholeSection[j] = 1;
                }
            }
        }   
        return count;
    }
}