import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                double sum = 0;
                double average = 0;
                
                StringTokenizer str = new StringTokenizer(br.readLine());
                int students = Integer.parseInt(str.nextToken());
                double[] scores = new double[students];
                for(int j = 0; j < students; j++){
                    double score = Integer.parseInt(str.nextToken());
                    sum += score;
                    scores[j] = score;
                }
                average = sum/students;
                
                double countStudents = 0;
                for(int j = 0; j < students; j++){
                    if(average < scores[j]) countStudents++;
                }
                
                System.out.println(String.format("%.3f%s",countStudents*100/students,"%"));
            }
        }
    }
}