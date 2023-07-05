import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            int[] people = new int[count];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < count; i++) {
                people[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(people);
            int answer = 0;
            for(int x : people) {
                answer += x * count;
                count--;
            }
            
            System.out.println(answer);
        }
    }
}