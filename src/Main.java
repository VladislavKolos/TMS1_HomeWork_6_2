import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }
}