import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String[] line = br.readLine().split(" ");
            String type = "";
            for(int i = 0; i < line.length - 1; i++){
                int num = Integer.parseInt(line[i]);
                if(num + 1 == Integer.parseInt(line[i+1])) type = "ascending";
                else if(num - 1 == Integer.parseInt(line[i+1])) type = "descending";
                else {
                    type = "mixed";
                    break;
                }
            }
            System.out.println(type);
        }
    }
}