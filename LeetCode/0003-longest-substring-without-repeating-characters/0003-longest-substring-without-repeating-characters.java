class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int result = 0;
        Map<String, Integer> dic = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Integer idx = dic.get(Character.toString(s.charAt(i)));
            if(idx != null) {
                result = Math.max(result, dic.size());
                dic = new HashMap<>();
                for(int j = idx+1; j < i; j++) {
                    dic.put(Character.toString(s.charAt(j)), j);
                }
            }
            
            dic.put(Character.toString(s.charAt(i)), i);
        }
        
        return Math.max(result, dic.size());
    }
}