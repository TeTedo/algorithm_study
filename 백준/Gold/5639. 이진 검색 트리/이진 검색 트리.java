import java.io.*;
import java.util.*;

class Main{

    public static class Node {
        Node left;
        Node right;
        int num;

        public Node(int num) {
            this.num = num;
        }

        public void insert(int n) {
            if(n > num) {
                if(this.right == null) this.right = new Node(n);
                else this.right.insert(n);
            }else {
                if(this.left == null) this.left = new Node(n);
                else this.left.insert(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String line = br.readLine();
            Node root = new Node(Integer.parseInt(line));
            
            while((line = br.readLine()) != null && !line.equals("")) {
                root.insert(Integer.parseInt(line));    
            }

            dfs(root);
        }
    }

    public static void dfs(Node node) {
        if(node == null) return;

        dfs(node.left);
        dfs(node.right);
        System.out.println(node.num);
    }
}