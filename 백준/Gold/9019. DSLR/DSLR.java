import java.io.*;
import java.util.*;

class Main{
    static class Temp {
        int num;
        String command;

        Temp(int num, String command) {
            this.num = num;
            this.command = command;
        }

        int D() {
            return (num * 2) % 10000;
        }

        int S() {
            return num == 0 ? 9999 : num - 1;
        }

        int L() {
            return num % 1000 * 10 + num / 1000;
        }

        int R() {
            return num % 10 * 1000 + num / 10;
        }
    }

    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int count = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < count; i++) {
                StringTokenizer stt = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(stt.nextToken());
                int end = Integer.parseInt(stt.nextToken());

                Queue<Temp> queue = new LinkedList<>();
                boolean[] check = new boolean[10000];
                check[start] = true;
                queue.offer(new Temp(start, ""));

                while(!queue.isEmpty()){
                    Temp cur = queue.poll();

                    if (cur.num == end) {
                        System.out.println(cur.command);
                        break;
                    }

                    if (!check[cur.D()]) {
                        queue.add(new Temp(cur.D(), cur.command + "D"));
                        check[cur.D()] = true;
                    }
                    if (!check[cur.S()]) {
                        queue.add(new Temp(cur.S(), cur.command + "S"));
                        check[cur.S()] = true;
                    }
                    if (!check[cur.L()]) {
                        queue.add(new Temp(cur.L(), cur.command + "L"));
                        check[cur.L()] = true;
                    }
                    if (!check[cur.R()]) {
                        queue.add(new Temp(cur.R(), cur.command + "R"));
                        check[cur.R()] = true;
                    }
                }
            }
        }
    }
}