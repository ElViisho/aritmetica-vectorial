// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v = new VectorND(new double[] {1, 2, 3, 4});
  System.out.println(v.toString());

  VectorND v1 = new VectorND(new double[] {1, 2, 8, 0, 2, 54});
  VectorND v2 = new VectorND(new double[] {-1, 3, 2, 1});

  double v1l = v1.getLength();
  double v2l = v2.getLength();

  System.out.println(v1l);
  System.out.println(v2l);

  }
}


