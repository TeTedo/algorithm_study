import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int sum = 0;
            for(int i = 0; i < count; i++){
                sum += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(sum);
        }
    }
}