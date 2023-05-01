import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++){
            rank.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int index = rank.get(callings[i]);
            
            String temp = players[index-1];    
            players[index -1] = callings[i];
            players[index] = temp;
            rank.replace(callings[i],index-1);
            rank.replace(temp,index);
        }
        return players;
    }
}