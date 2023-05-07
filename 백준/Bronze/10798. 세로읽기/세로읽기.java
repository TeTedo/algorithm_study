import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringBuilder sb = new StringBuilder();
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            String line4 = br.readLine();
            String line5 = br.readLine();
            String[] lines = {line1,line2,line3,line4,line5};
            int index = 0;
            while(true){
                String temp = sb.toString();
                for(int i = 0; i < 5; i++){
                    if(index < lines[i].length())
                        sb.append(lines[i].charAt(index));
                }
                if(sb.toString().equals(temp)) break;
                index++;
            }
            
            
            System.out.println(sb);
        }
    }
}