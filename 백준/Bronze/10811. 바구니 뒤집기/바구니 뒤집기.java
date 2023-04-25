import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer condition = new StringTokenizer(br.readLine());
            int numbers = Integer.parseInt(condition.nextToken());
            int[] buckets = new int[numbers];
            for(int i = 0; i < numbers; i++){
                buckets[i] = i+1;
            }
            int count = Integer.parseInt(condition.nextToken());
            
            for(int i = 0; i < count; i++){
                Stack<Integer> stack = new Stack<>();
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                
                for(int j = start-1; j < end; j++){
                    stack.push(buckets[j]);
                }
                for(int j = start-1; j < end; j++){
                    buckets[j] = stack.pop();
                }
            }
            
            for(int bucket:buckets){
                System.out.print(bucket + " ");
            }
        }
    }
}