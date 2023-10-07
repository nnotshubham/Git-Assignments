package Problem8series;

import java.util.Scanner;

public class NewCalculator {

    private static double calculator(double x, double y, char s) {
        double result = 0.0;
        switch (s) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
        }
        return result;
    }

    public static void main(String[] args) {
        double a, b;
        char symbol;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextDouble();

        System.out.print("Enter b: ");
        b = input.nextDouble();

        System.out.print("Enter symbol: ");
        symbol = input.next().charAt(0);

        double result = 0;
        result = calculator(a, b, symbol);

        System.out.println("Result: " + result);
    }
}