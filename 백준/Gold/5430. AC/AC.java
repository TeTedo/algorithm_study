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
                String command = br.readLine();
                int len = Integer.parseInt(br.readLine());
                StringTokenizer stt = new StringTokenizer(br.readLine(), "[],");

                Deque<String> dq = new ArrayDeque<>();
                for(int j = 0; j < len; j++) {
                    dq.add(stt.nextToken());
                }

                boolean isReversed = false;
                boolean isSuccess = true;

                for(char x : command.toCharArray()) {
                    if(x == 'R'){
                        isReversed = !isReversed;
                    }else {
                        if(dq.size() == 0){
                            isSuccess = false;
                            break;
                        }

                        if(isReversed) {
                            dq.pollLast();
                        }else {
                            dq.pollFirst();
                        }
                    }
                }

                
                if(isSuccess) {
                    sb.append("[");
                    if(dq.size() > 0) {
                        if(isReversed) {
                            sb.append(dq.pollLast());
                            int n = dq.size();
                            for(int j = 0; j < n; j++) {
                                sb.append(",").append(dq.pollLast());
                            }
                        } else {
                            sb.append(dq.pollFirst());
                            int n = dq.size();
                            for(int j = 0; j < n; j++) {
                                sb.append(",").append(dq.pollFirst());
                            }
                        }
                    }
                    sb.append("]").append("\n");
                }else {
                    sb.append("error").append("\n");
                }
            }
            System.out.println(sb);
        }
    }
}