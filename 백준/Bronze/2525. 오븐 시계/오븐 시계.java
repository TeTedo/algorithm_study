import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st1.nextToken());
        int min = Integer.parseInt(st1.nextToken());
        int time = Integer.parseInt(st2.nextToken());
        
        min += time;
        while(min >= 60){
             min -= 60;
            hour++;
        }
        
        if (hour >= 24) hour -= 24;
        System.out.println(hour + " " + min);
        
    }
}