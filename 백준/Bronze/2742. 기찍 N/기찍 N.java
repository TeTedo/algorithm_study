import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int number = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < number; i++){
                sb.append(number-i).append("\n");
            }
            System.out.println(sb);
        }
    }
}