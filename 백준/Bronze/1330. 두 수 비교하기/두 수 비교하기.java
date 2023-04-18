import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        short b = sc.nextShort();

        if(a > b) System.out.print(">");
        if(a < b) System.out.print("<");
        if(a == b) System.out.print("==");
    }
}