import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}