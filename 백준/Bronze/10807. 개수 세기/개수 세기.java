import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            int result = 0;
            
            int count = Integer.parseInt(br.readLine());
            String numbersLine = br.readLine();
            int value = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(numbersLine);
            while(st.hasMoreTokens()){
                int number = Integer.parseInt(st.nextToken());
                if(number == value) result++;
            }
            
            System.out.println(result);
            
        }
    }
}