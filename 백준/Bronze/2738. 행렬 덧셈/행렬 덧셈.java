import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer condition = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(condition.nextToken());
            int column = Integer.parseInt(condition.nextToken());
            int[][] matrix = new int[row][column];
            for(int i = 0; i < row * 2; i++){
                StringTokenizer str = new StringTokenizer(br.readLine());
                for(int j = 0; j < column; j++){
                    int number = Integer.parseInt(str.nextToken());
                    matrix[i % row][j] += number;
                }
            }
            
            for(int[] columns:matrix){
                for(int number:columns){
                    System.out.print(number + " ");
                }
                System.out.println("");
            }
        }
    }
}