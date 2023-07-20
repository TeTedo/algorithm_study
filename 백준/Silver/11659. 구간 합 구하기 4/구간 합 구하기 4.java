import java.util.*;
import java.io.*;

class Main {
	static public void main(String []args) throws IOException{
		try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numsLen = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            int[] nums = new int[numsLen+1];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i = 1; i <= numsLen; i++) {
                nums[i] = Integer.parseInt(st2.nextToken()) + nums[i-1];
            }

            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < count; i++) {
                StringTokenizer st3 = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st3.nextToken());
                int end = Integer.parseInt(st3.nextToken());
                sb.append(nums[end] - nums[start-1]).append("\n");
            }
            System.out.println(sb);
        }
    }
}