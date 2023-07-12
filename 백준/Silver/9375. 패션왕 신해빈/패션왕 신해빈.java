import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int total = Integer.parseInt(br.readLine());
            for(int i = 0; i < total; i++) {
                int count = Integer.parseInt(br.readLine());
                String[] clothes = new String[count];
                for(int j = 0; j < count; j++) {
                    clothes[j] = br.readLine().split(" ")[1];
                }

                HashMap<String, Integer> map = new HashMap<>();
                for (String cloth : clothes) {
                    map.put(cloth, map.getOrDefault(cloth, 0) + 1);
                }

                int answer = 1;
                for (int value : map.values()) {
                    answer *= (value + 1); 
                }

                answer--; 
                System.out.println(answer);
            }
        }
    }
}