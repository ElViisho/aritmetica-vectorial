// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v = new VectorND(new double[] {1, 2, 3, 4});
  System.out.println(v.toString());

  Vector2D v2 = new Vector2D(new double[] {1, 5.1});
  System.out.println(v2.toString());
  }
}


