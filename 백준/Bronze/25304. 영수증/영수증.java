import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int checkTotal = 0;
        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            checkTotal += price * num;
        }
        
        if(total == checkTotal) System.out.println("Yes");
        else System.out.println("No");
    }
}