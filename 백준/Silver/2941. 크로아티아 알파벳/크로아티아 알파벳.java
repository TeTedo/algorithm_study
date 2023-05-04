import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
            for(int i = 0; i < croatia.length; i++){
                if(str.contains(croatia[i]))
                    str = str.replaceAll(croatia[i],"@");
            }
            System.out.println(str.length());
        }
    }
}