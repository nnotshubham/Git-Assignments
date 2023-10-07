package Problem8series;

import java.util.*;

public class question3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int height_input = s.nextInt();
    if (height_input >= 200) {
      System.out.println("Person is very tall");
    } else if (height_input >= 180) {
      System.out.println("Person is tall");
    } else if (height_input >= 165) {
      System.out.println("Person has average height");
    } else {
      System.out.println("Person is considered short!!");
    }
  }
}
