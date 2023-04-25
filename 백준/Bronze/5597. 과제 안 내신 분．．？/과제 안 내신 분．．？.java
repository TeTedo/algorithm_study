import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String number;
            int[] students = new int[30];
            while((number = br.readLine()) != null){
                students[Integer.parseInt(number)-1] = 1;
            }
            for(int i = 0; i < 30; i++){
                if(students[i] != 1) System.out.println(i+1);
            }
        }
    }
}