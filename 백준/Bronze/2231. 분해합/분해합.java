import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            int number = Integer.parseInt(str);
            int len = str.length();
            int result = 0;
            for(int i = number - (len * 9) ; i <= number; i++){
                
                int sum = 0;
                int num = i;
                while(num != 0){
                    sum += num % 10;
                    num /= 10;
                }
                if(i + sum == number) {
                    result = i;
                    break;
                }
            }
            
            
            System.out.println(result);
        }
    }
}