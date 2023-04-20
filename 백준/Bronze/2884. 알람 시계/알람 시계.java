import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken()) - 45;
        
        if(min < 0){
            min += 60;
            hour -= 1;
        }
        
        if(hour < 0) hour += 24;
        
        System.out.println(hour + " " + min);
        
    }
}