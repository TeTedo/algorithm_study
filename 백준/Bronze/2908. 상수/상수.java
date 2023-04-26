import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] a = st.nextToken().split("");
            String[] b = st.nextToken().split("");
            
            List<String> lista = Arrays.asList(a);
            List<String> listb = Arrays.asList(b);
            
            Collections.reverse(lista);
            Collections.reverse(listb);
            
            String stringa = String.join("",lista);
            String stringb = String.join("",listb);
            int max = Math.max(Integer.parseInt(stringa),Integer.parseInt(stringb));
            System.out.println(max);
        }
    }
}