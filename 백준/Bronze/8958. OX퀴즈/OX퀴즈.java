import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++){
                String str = br.readLine();
                int score = 0;
                int stack = 0;
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(j) == 'O'){
                        score += 1 + stack;
                        stack++;
                    }
                    else stack = 0;
                }
                System.out.println(score);
            }
            
        }
    }
}