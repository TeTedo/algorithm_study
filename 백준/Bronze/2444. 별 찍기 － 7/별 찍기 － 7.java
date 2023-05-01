import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < 2*count-1; i++){
                 System.out.print(" ".repeat(Math.abs(count-1-i)));
                if(i <= count-1) System.out.println("*".repeat(i*2+1));
                else System.out.println("*".repeat(2*(2*count-1-i)-1));
            }
        }
    }
}