// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v1 = new VectorND(new double[] {1, 2, 8, 0, 2, 54});
  VectorND v2 = new VectorND(new double[] {-1, 3, 2, 1});
  System.out.println(v1.dotProduct(v2));

  VectorND v3 = new VectorND(new double[] {1, 2, -8, -1, 1, 0});
  VectorND v4 = new VectorND(new double[] {-1, -2, 8, 1});
  System.out.println(v3.dotProduct(v4));

  }
}


