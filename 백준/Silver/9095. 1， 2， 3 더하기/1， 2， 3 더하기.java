import java.io.*;
import java.util.*;

class Main{
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++) {
                int num = Integer.parseInt(br.readLine());
                dfs(0,num);
                System.out.println(answer);
                answer = 0;
            }
        }


    }

    private static void dfs(int cur, int num){
        if(cur > num) return;
        if(cur == num) {
            answer++;
            return;
        }

        for(int i = 1; i <= 3; i++) {
            dfs(cur+i, num);
        }
    }
}