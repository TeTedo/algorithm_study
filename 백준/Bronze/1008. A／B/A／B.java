import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = (sc.nextDouble());
            double b = (sc.nextDouble());
            System.out.println(a / b);
        }
    }
}
