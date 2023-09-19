package Problem5series;

import java.util.Scanner;

class basic {
    public static void main(String[] args) {
        Scanner myString = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = myString.nextInt();
        System.out.println("The String you entered is:" + n);

        for (; n >= n - 3; n -= 1) {

            System.out.println(n + " ");

        }

    }
}