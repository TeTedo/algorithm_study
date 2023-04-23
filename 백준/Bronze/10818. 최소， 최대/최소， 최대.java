import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().split(" ");
            int min = Integer.parseInt(numbers[0]);
            int max = Integer.parseInt(numbers[0]);
            for(int i = 1; i < count; i++){
                min = Math.min(min,Integer.parseInt(numbers[i]));
                max = Math.max(max,Integer.parseInt(numbers[i]));
            }
            System.out.println(min + " " + max);    
        }     
    }
}