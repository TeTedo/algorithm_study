import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int sum = 1;
            for(int i = 0; i < 3; i++){
                sum *= Integer.parseInt(br.readLine());
            }
            String str = String.valueOf(sum);
            int[] numbers = new int[10];
            for(int i = 0; i < str.length(); i++){
                int number = Character.getNumericValue(str.charAt(i));
                numbers[number]++;
            }
            
            for(int number:numbers){
                System.out.println(number);
            }
        }
    }
}