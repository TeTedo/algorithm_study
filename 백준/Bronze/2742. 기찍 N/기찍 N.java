import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int number = Integer.parseInt(br.readLine());
            for(int i = 0; i < number; i++){
                System.out.println(number-i);
            }
        }
    }
}