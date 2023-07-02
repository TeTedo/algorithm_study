import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            
            while(true) {
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                int count = Integer.parseInt(st.nextToken());
                int money = (int) Math.round(Double.parseDouble(st.nextToken()) * 100);
                
                if(count == 0 && money == 0) break;

                int[] cals = new int[money+1];

                for(int i = 0; i < count; i++) {
                    String given = br.readLine();
                    StringTokenizer stk = new StringTokenizer(given);

                    int cal = Integer.parseInt(stk.nextToken());
                    int price = (int) Math.round(Double.parseDouble(stk.nextToken()) * 100);
                    if(price > money) continue;

                    for(int j = price; j <= money; j++) {
                        int prev = j - price;
                        int max = Math.max(cals[prev] + cal, cals[j]);
                        cals[j] = max;
                    }
                }

                System.out.println(cals[money]);
            }
        }
    }
}