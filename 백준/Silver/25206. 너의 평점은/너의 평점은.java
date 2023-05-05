import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            HashMap<String,Double> map = new HashMap<>();
            map.put("A+",4.5);
            map.put("A0",4.0);
            map.put("B+",3.5);
            map.put("B0",3.0);
            map.put("C+",2.5);
            map.put("C0",2.0);
            map.put("D+",1.5);
            map.put("D0",1.0);
            map.put("F",0.0);
            
            double sum = 0;
            double totalScore = 0;
            for(int i = 0; i < 20; i++){
                String[] str = br.readLine().split(" ");
                if(str[2].equals("P")) continue;
                double count = Double.parseDouble(str[1]);
                double score = map.get(str[2]) * count;
                sum += count;
                totalScore += score;
            }
            System.out.println(totalScore/sum);
        }
    }
}