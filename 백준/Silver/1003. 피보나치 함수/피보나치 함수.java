import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++) {
                int num = Integer.parseInt(br.readLine());
                if(num == 0) {
                    System.out.println(1 + " " + 0);
                    continue;
                }

                int[][] call = new int[num + 1][2];
                call[0] = new int[]{1, 0};
                call[1] = new int[]{0, 1};
                for(int j = 2; j <= num; j++) {
                    call[j][0] = call[j-1][0] + call[j-2][0];
                    call[j][1] = call[j-1][1] + call[j-2][1];
                }

                System.out.println(call[num][0] + " " + call[num][1]);
            }
        }
    }
}