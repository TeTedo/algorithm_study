import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < count; i++) {
                int num = Integer.parseInt(br.readLine());
                TreeMap<Integer, Integer> map = new TreeMap<>();

                for(int j = 0; j < num; j++) {
                    StringTokenizer stt = new StringTokenizer(br.readLine());
                    String method = stt.nextToken();
                    int number = Integer.parseInt(stt.nextToken());

                    if(method.equals("I")){
                        map.put(number, map.getOrDefault(number,0)+1);
                    }else {
                        if(map.size() == 0) continue;
                        int key = number == 1 ? map.lastKey() : map.firstKey();
                        int cnt = map.get(key);
                        if(cnt == 1) map.remove(key);
                        else map.put(key, map.get(key)-1);
                    }
                }

                if(map.size() == 0) sb.append("EMPTY").append("\n");
                else sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
            System.out.println(sb);
        }
    }
}