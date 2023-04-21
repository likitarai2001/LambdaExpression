import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator.Operation add = (int x, int y) -> x + y;
        Calculator.Operation multiply = (int x, int y) -> x * y;

        Calculator calc_obj = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println("Addition : " + calc_obj.compute(a, b, add));
        System.out.println("Multiplication : " + calc_obj.compute(a, b, multiply));
    }
}