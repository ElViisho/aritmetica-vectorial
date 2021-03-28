// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  VectorND v1 = new VectorND(new double[] {1, 2, 8, 0, 2, 54});
  Vector2D v2 = new Vector2D(new double[] {-1, 3, 2, 1});
  ZeroVector v0 = new ZeroVector(new double[] {2, 3, 1});
  Vector3D v3 = new Vector3D();


  System.out.println(v1.isZeroVector());
  System.out.println(v2.isZeroVector());
  System.out.println(v0.isZeroVector());
  System.out.println(v3.isZeroVector());


  }
}


