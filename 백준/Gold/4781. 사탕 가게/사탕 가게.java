import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String line = "";
            while((line = br.readLine()).charAt(0) != '0') {
                StringTokenizer st = new StringTokenizer(line);
                int count = Integer.parseInt(st.nextToken());
                int money = (int) Math.round(Double.parseDouble(st.nextToken()) * 100);
                
                HashMap<Integer,Integer> hashMap = new HashMap<>();

                for(int i = 0; i < count; i++) {
                    String given = br.readLine();
                    StringTokenizer stk = new StringTokenizer(given);

                    int cal = Integer.parseInt(stk.nextToken());
                    int price = (int) Math.round(Double.parseDouble(stk.nextToken()) * 100);
                    if(price > money) continue;

                    for(int j = price; j <= money; j++) {
                        int prev = j - price;
                        int max = Math.max(hashMap.getOrDefault(prev,0) + cal, hashMap.getOrDefault(j, 0));
                        hashMap.put(j, max);
                    }
                }

                System.out.println(hashMap.getOrDefault(money,0));
            }
        }
    }
}