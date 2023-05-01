import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            int index = 0;
            String temp = "";
            int result = 1;
            for(int i = str.length()-1; i >= 0; i--){
                if(str.charAt(index) != str.charAt(i)){
                    result = 0;
                    break;
                }
                index++;
            }
            
            System.out.println(result);
        }
    }
}