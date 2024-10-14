class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int len = convertTimeToInt(video_len);
        int posLen = convertTimeToInt(pos);
        int opStartLen = convertTimeToInt(op_start);
        int opEndLen = convertTimeToInt(op_end);
        
        if (posLen >= opStartLen && posLen < opEndLen) {
                posLen = opEndLen;
        }
        
        for(String command : commands) {
            
            if (command.equals("next")) {
                posLen += 10;
            } else {
                posLen -= 10;
            }


            if (posLen > len) posLen = len;
            if (posLen < 0) posLen = 0;

            if (posLen >= opStartLen && posLen < opEndLen) {
                posLen = opEndLen;
            }
        }
        
        int hour = posLen / 60;
        int min = posLen % 60;
        String result = timeToString(hour) + ":" + timeToString(min);
        
        
        return result;
    }
    
    private int convertTimeToInt(String time) {
        int result = Integer.valueOf(time.split(":")[0]) * 60;
        result += Integer.valueOf(time.split(":")[1]);
    
        return result;
    }
    
    private String timeToString (int input) {
        String result = "";
        if (input < 10) {
            result += "0";
        }
        
        result += String.valueOf(input);
        return result;
    }
}

