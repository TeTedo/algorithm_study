import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            String temp = "";
            for(int i = str.length()-1; i >= 0; i--){
                temp += str.charAt(i);
            }
            
            System.out.println(str.equals(temp) ? 1 : 0);
        }
    }
}