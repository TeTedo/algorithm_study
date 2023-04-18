import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            BigInteger money = sc.nextBigInteger();
            BigInteger number = sc.nextBigInteger();

            System.out.println(money.divide(number));
            System.out.println(money.remainder(number));
        }

    }
}