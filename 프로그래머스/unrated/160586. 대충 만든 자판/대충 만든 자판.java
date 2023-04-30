import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 제일 빨리 누르는 key mapping
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                if(map.get(keymap[i].charAt(j)) == null){
                    map.put(keymap[i].charAt(j),j+1);   
                }else{
                    if(map.get(keymap[i].charAt(j)) > j+1){
                        map.put(keymap[i].charAt(j),j+1);
                    }
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++){
                if(map.get(targets[i].charAt(j)) == null) {
                    sum = -1;
                    break;
                }
                sum += map.get(targets[i].charAt(j));
            }
            answer[i] = sum;
        }
        return answer;
    }
}