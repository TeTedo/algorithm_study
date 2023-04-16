import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            short a = sc.nextShort();
            short b = sc.nextShort();
            short c = sc.nextShort();
            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b % c)) % c);
            System.out.println((a * b) % c);
            System.out.println(((a % c) * (b % c)) % c);

        }
    }
}