import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int sum = 0;
            while(str.hasMoreTokens()){
                sum += Math.pow(Integer.parseInt(str.nextToken()),2);
            }
            System.out.println(sum%10);
        }
    }
}