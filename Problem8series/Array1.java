package Problem8series;

public class Array1 {

    public static void main(String[] args) {
        int x = 10;
        int[] arrayOfIntegers = { 12, 1, 4, 30, 200 };

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            // Array at 1 position: 12
            // Array at 2 position: 1
            // Array at 3 position: 4
            // Array at 4 position: 30
            // Array at 5 position: 200

            System.out.println("Array at " + (i + 1) + " position: " + arrayOfIntegers[i]);
        }

    }
}
