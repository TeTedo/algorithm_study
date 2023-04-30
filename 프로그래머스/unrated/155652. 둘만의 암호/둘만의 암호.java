class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int check = 0;
            while(index > check){
                c++;
                if(c > 'z') c-=26;
                if(!skip.contains(String.valueOf(c))) check++;
            }
            answer += c;
        }
        return answer;
    }
}