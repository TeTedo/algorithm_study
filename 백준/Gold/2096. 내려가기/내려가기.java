import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());

            StringTokenizer st;
            int[] min = new int[3];
            int[] max = new int[3];

            for(int i = 0; i < count; i++) {
                st = new StringTokenizer(br.readLine());

                int x1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int x3 = Integer.parseInt(st.nextToken());

                if(i == 0) {
                    min[0] = max[0] = x1;
                    min[1] = max[1] = x2;
                    min[2] = max[2] = x3;
                }else {
                    int min1 = min[0];
                    int min2 = min[1];
                    int min3 = min[2];

                    min[0] = x1 + Math.min(min1,min2);
                    min[1] = x2 + Math.min(min3,Math.min(min1,min2));
                    min[2] = x3 + Math.min(min2,min3);

                    int max1 = max[0];
                    int max2 = max[1];
                    int max3 = max[2];

                    max[0] = x1 + Math.max(max1,max2);
                    max[1] = x2 + Math.max(max3,Math.max(max1,max2));
                    max[2] = x3 + Math.max(max2,max3);
                }
            }

            int maxAnswer = Math.max(max[2], Math.max(max[0],max[1]));
            int minAnswer = Math.min(min[2], Math.min(min[0],min[1]));

            System.out.println(maxAnswer + " " + minAnswer);
        }
    }
}