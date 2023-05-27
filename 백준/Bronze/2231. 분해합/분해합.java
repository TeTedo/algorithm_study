import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String str = br.readLine();
            int number = Integer.parseInt(str);
            boolean flag = false;
            for(int i = 0; i < number; i++){
                String[] strs = String.valueOf(i).split("");
                
                int strSum = 0;
                for(String x : strs){
                    strSum += Integer.parseInt(x);
                }
                if(i + strSum == number) {
                    System.out.println(i);   
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(0);
        }
    }
}