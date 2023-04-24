import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int number = 0;
            int index = 0;
            int count = 0;
            String line;
            while((line = br.readLine()) != null){
                int givenNumber = Integer.parseInt(line);
                count++;
                if(number < givenNumber){
                    number = givenNumber;
                    index = count;
                }
            }
            bw.write(number + "\n" + index);
            bw.flush();    
        }
    }
}