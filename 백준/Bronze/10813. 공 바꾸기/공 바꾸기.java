import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            StringTokenizer condition = new StringTokenizer(br.readLine());
            int[] buckets = new int[Integer.parseInt(condition.nextToken())];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = i+1;
            }
            int count = Integer.parseInt(condition.nextToken());
            
            for(int i =0; i < count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken())-1;
                int second = Integer.parseInt(st.nextToken())-1;
                
                int temp = buckets[first];
                buckets[first] = buckets[second];
                buckets[second] = temp;
            }
            
            for(int bucket:buckets){
                bw.write(bucket + " ");    
            }
            bw.flush();
        }
    }
}