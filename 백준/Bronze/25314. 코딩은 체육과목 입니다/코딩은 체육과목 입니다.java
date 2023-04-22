import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine())/4;
        String output = "";
        
        for(int i = 0; i < count; i++){
            output += "long ";
        }
        
        System.out.println(output + "int");
    }
}