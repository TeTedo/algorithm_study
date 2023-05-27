import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            for(int i = 0; i < count; i++){
                int number = Integer.parseInt(st.nextToken());
                if(number == 1) continue;
                boolean flag = true;
                for(int j = 2; j <= Math.sqrt(number); j++){
                    if(number % j == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
            System.out.println(answer);
        }
    }
}