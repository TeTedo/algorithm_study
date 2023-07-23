import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer stt = new StringTokenizer(br.readLine(), "-");

            int sum = Integer.MAX_VALUE;
            while(stt.hasMoreTokens()) {
                StringTokenizer stt2 = new StringTokenizer(stt.nextToken(), "+");
                int temp = 0;
                while(stt2.hasMoreTokens()) {
                    temp += Integer.parseInt(stt2.nextToken());
                }

                if(sum == Integer.MAX_VALUE) {
                    sum = temp;
                }else {
                    sum -= temp;
                }
            }

            System.out.println(sum);
        }
    }
}