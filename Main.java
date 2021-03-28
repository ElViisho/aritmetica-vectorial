// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v = new VectorND(new double[] {1, 2, 3, 4});
  System.out.println(v.toString());

  VectorND v2 = new VectorND(new double[] {1, 2, 8, 0, 2, 54});
  VectorND v1 = new VectorND(new double[] {-1, 3, 2, 1});

  VectorND v3 = v1.add(v2);

  System.out.println(v3.toString());


  }
}


