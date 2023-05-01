import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) < 'P') sum += (str.charAt(i)+1)/3 -19;
                else if(str.charAt(i) < 'T') sum += 8;
                else if(str.charAt(i) < 'W') sum += 9;
                else sum += 10;
            }
            System.out.println(sum);
        }
    }
}