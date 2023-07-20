import java.util.*;
import java.io.*;

class Main {
	static public void main(String []args) throws IOException{
		try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 1; i <= 20; i++) {
                map.put(i, 0);
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < count; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String string = st.nextToken();
                int num = 0;
                if(st.hasMoreTokens()){
                    num = Integer.parseInt(st.nextToken());
                }
                
                switch (string) {
                    case "all" :
                        for(int j = 1; j <= 20; j++) {
                            map.put(j,1);
                        }
                        break;
                    case "empty" :
                        for(int j = 1; j <= 20; j++) {
                            map.put(j,0);
                        }
                        break;
                    case "add" : 
                        map.put(num, 1);
                        break;
                    case "remove" :
                        map.put(num, 0);
                        break;
                    case "check" :
                        sb.append(map.get(num)).append("\n");
                        break;
                    case "toggle" :
                        if(map.get(num) == 0) map.put(num, 1);
                        else map.put(num, 0);
                        break;
                    
                }
            }

            System.out.println(sb);
        }
    }
}