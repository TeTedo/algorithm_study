import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            StringTokenizer condition = new StringTokenizer(br.readLine());
            // input number to bowl
            int len = Integer.parseInt(condition.nextToken());
            int[] bowls = new int[len+1];
            for(int i = 1; i <= len; i++){
                bowls[i] = i;
            }
            
            int count = Integer.parseInt(condition.nextToken());
            for(int i = 0; i < count; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int mid = Integer.parseInt(st.nextToken());
                
                Queue<Integer> temp = new LinkedList<>();
                for(int j = start; j <= end; j++){
                    if(mid <= end){
                        temp.add(bowls[j]);
                        bowls[j] = bowls[mid];
                        mid++;
                    }else{
                        temp.add(bowls[j]);
                        bowls[j] = temp.poll();
                    }
                }
                temp.clear();
            }
            
            for(int i = 1; i <= len; i++){
                bw.write(bowls[i] + " ");
            }
            bw.flush();
        }
    }
}