package Problem5series;

public class basic2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i += 1) {
            for (int j = i; j >= i; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}