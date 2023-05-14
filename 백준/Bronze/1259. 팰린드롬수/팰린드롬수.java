import java.io.*;

class Main{
    public static void main(String[] agrs) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = "";
            while(!(str = br.readLine()).equals("0")){
                boolean isTrue = true;
                for(int i = 0; i < str.length()/2; i++){
                    if(str.charAt(i) != str.charAt(str.length()-1-i)){
                        isTrue = false;
                        break;
                    }
                }
            
                if(isTrue) System.out.println("yes");
                else System.out.println("no");    
            }
        }
    }
}