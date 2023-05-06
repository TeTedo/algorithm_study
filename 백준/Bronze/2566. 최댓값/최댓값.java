import java.io.*;

class Main{
    public static void main(String[]  args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String line = "";
            int j = 0;
            int maxX = 0;
            int maxY = 0;
            int max = -1;
            while((line = br.readLine()) != null){
                String[] strs = line.split(" ");
                for(int i = 0; i < strs.length; i++){
                    int number = Integer.parseInt(strs[i]);
                    if(number > max){
                        max = number;
                        maxX = j+1;
                        maxY = i+1;
                    }
                }
                j++;
            }
            System.out.println(max);
            System.out.print(maxX + " " + maxY);
        }
    }
}