import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextShort();
            int b = sc.nextShort();
            int b1 = b % 10;
            int b2 = b % 100 - b1;
            int b3 = b - b2  - b1;
            System.out.println(a * b1);
            System.out.println(a * b2/10);
            System.out.println(a * b3/100);
            System.out.println(a * b);
        }
    }
}