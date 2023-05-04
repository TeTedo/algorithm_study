import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int result = 0;
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                String str = br.readLine();
                if(str.length() == 1){
                    result++;
                    continue;
                }
                HashMap<Character, Integer> map = new HashMap<>();
                char last = str.charAt(0);
                map.put(last,1);
                for(int j = 1; j < str.length(); j++){
                    char currentC = str.charAt(j);
                    if(last == currentC) continue;
                    if(map.get(currentC) == null) map.put(currentC,1);
                    else {
                        result--;
                        break;
                    }
                    last = currentC;
                }
                result++;
            }
            
            System.out.println(result);
        }
    }
}