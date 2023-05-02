import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine().toUpperCase();
            Map<Character,Integer> map = new HashMap<>();
            int max = 0;
            String result = String.valueOf(str.charAt(0));
            for(int i = 0; i < str.length(); i++){
                char upper = str.charAt(i);
                if(map.get(upper) == null) map.put(upper,1);
                else map.put(upper,map.get(upper)+1);
                
                int currentValue = map.get(upper);
                if(max == currentValue) result = "?";
                else if(max < currentValue){
                    max = currentValue;
                    result = String.valueOf(upper);
                }
            }
            
            System.out.println(result);
        }
    }
}