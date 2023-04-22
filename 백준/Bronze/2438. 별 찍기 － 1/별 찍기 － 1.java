import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                String star = "";
                for(int j = 0; j <= i; j++){
                    star += "*";
                }
                bw.write(star + "\n");
            }
            bw.flush();
        }   
    }
}