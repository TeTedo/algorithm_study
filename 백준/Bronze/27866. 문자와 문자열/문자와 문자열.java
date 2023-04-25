import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String[] str = br.readLine().split("");
            int index = Integer.parseInt(br.readLine());
            
            System.out.print(str[index-1]);
        }   
    }
}