import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int money = Integer.parseInt(st.nextToken());

            int[] coins = new int[count];
            for(int i = 0; i < count; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }

            int answer = 0;
            for(int i = count-1; i >= 0; i--) {
                if(coins[i] <= money) {
                    answer += money / coins[i];
                    money %= coins[i];
                }
            }
            System.out.println(answer);
        }
    }
}