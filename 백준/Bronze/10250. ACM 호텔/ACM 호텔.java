import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());

                int number = n / x + 1;
                int floor = n % x;
                if(floor == 0){
                    floor = x;
                    number -= 1;
                }
                String unit = String.valueOf(number);
                if(unit.length() == 1){
                    unit = "0" + unit;
                }
                String door = String.valueOf(floor) + unit;

                System.out.println(door);
            }
        }
    }
}