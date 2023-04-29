import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // HashMap에 점수 매핑
        HashMap<String,Integer> score = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            score.put(name[i],yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                if(score.get(photo[i][j]) != null){
                     answer[i] += score.get(photo[i][j]);   
                }
            }
     
        }
        return answer;
    }
}