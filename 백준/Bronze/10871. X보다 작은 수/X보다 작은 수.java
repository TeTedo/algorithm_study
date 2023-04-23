import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st1.nextToken());
            int value = Integer.parseInt(st1.nextToken());
            int[] arr = new int[count];
            String[] arr2 = br.readLine().split(" ");
            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(arr2[i]);
            }
            for(int i =0; i < arr.length; i++){
                if(arr[i] < value) bw.write(arr[i] + " ");
            }
            bw.flush();    
        }  
    }
}