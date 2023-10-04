import java.io.*;
import java.util.*;

class Main{

    static int[] parent;

    public static void main(String[] args) throws IOException{
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer stt;
            stt = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(stt.nextToken());
            int M = Integer.parseInt(stt.nextToken());

            boolean[] people = new boolean[N+1];

            stt = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(stt.nextToken());
            if(num != 0) {
                for(int i = 0; i < num; i++) {
                    int person = Integer.parseInt(stt.nextToken());
                    people[person] = true;
                }
            }else {
                System.out.println(M);
                return;
            }

            HashSet<Integer>[] parties = new HashSet[M+1];
            for(int i = 1; i <= M; i++) {
                parties[i] = new HashSet<>();
            }
            parent = new int[N+1];
            for(int i = 1; i <= N; i++) {
                parent[i] = i;
            }

            // 파티 연관 관계
            for(int i = 1; i <= M; i++) {
                stt = new StringTokenizer(br.readLine());
                int count = Integer.parseInt(stt.nextToken());
                int[] who = new int[count+1];
                if(count <= 1) {
                    int person = Integer.parseInt(stt.nextToken());
                    parties[i].add(person);
                }else {
                    for(int j = 1; j <= count; j++) {
                        who[j] = Integer.parseInt(stt.nextToken());
                    }
                }


                for(int j = 1; j < count; j++) {
                    int a = who[j];
                    int b = who[j+1];

                    if(find(a) != find(b)) {
                        union(a,b);
                    }

                    parties[i].add(a);
                    parties[i].add(b);
                }
            }



            boolean[] visited = new boolean[N+1];
            for(int i = 1; i <= N; i++) {
                if(people[i] && !visited[i]) {
                    int root = find(i);
                    for(int j = 1; j <= N; j++) {
                        if(root == find(j)) {
                            people[j] = true;
                            visited[j] = true;
                        }
                    }
                }
            }

            int result = 0;
            for(int i = 1; i <= M; i++) {
                boolean flag = false;
                for(int person : parties[i]) {
                    if(people[person]) {
                        flag = true;
                        break;
                    }
                }

                if(!flag) result++;
            }

            System.out.println(result);
        }
    }

    static int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        
        return find(parent[x]);
    }

    static void union(int a, int b) {
        int parent_b = find(b);
        parent[parent_b] = a;
    }
}