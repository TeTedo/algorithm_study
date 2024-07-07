class Solution {
    public boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        
        int len = strX.length();
        
        for(int i = 0; i < len / 2; i++){
            if(strX.charAt(i) != strX.charAt(len - (i + 1))) {
                return false;
            }
        }
        
        
        return true;
    }
}