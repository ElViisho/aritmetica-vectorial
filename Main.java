// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v1 = new VectorND(new double[] {1, 2, 8, 0, 2, 54});
  Vector2D v2 = new Vector2D(new double[] {-1, 3, 2, 1});
  System.out.println(v1.isOppositeTo(v2));

  VectorND v3 = new VectorND(new double[] {1, 2, -8, -1, 1, 0});
  VectorND v4 = new VectorND(new double[] {-1, -2, 8, 1});
  System.out.println(v3.isOppositeTo(v4));

  }
}


