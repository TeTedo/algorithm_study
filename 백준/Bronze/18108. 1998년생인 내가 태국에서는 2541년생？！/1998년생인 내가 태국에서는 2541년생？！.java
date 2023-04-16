import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            short year = sc.nextShort();
            System.out.print(year - 543);
        }
    }
}