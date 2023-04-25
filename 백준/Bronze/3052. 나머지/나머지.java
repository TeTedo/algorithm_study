import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int result = 0;
            int[] numbers = new int[10];
            for(int i = 0; i < 10; i++){
                numbers[i] = Integer.parseInt(br.readLine()) % 42;
            }
            
            HashSet<Integer> hashSet = new HashSet<>();
            for(int number:numbers){
                if(!hashSet.contains(number)){
                    result++;
                    hashSet.add(number);
                }
            }
            
            System.out.println(result);
        }
    }
}