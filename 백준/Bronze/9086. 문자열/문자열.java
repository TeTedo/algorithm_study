import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                String str = br.readLine();
                System.out.println(str.substring(0,1) + str.substring(str.length()-1));
            }
        }
    }
}