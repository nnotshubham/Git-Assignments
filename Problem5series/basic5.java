package Problem5series;

import java.util.*;

public class basic5 {
  public static void main(String[] args) {
    Float[] numArr = new Float[6];
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter size:");
    float n = sc.nextFloat();
    for (int i = 0; i <= n; i++) {
      System.out.println("Enter Numbers:");
      Float num = sc1.nextFloat();
      numArr[i] = num;
    }
  }
}
