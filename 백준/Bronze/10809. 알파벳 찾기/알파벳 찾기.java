import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            int start = (int)("a".charAt(0));
            int end = (int)("z".charAt(0));
            for(int i = start; i <= end; i++){
                char c = (char)i;
                System.out.print(str.indexOf(c) + " ");
            }
        }
    }
}