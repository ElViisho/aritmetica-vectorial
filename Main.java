// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  Vector3D v1 = new Vector3D(new double[] {1, 2, 8});
  Vector3D v2 = new Vector3D(new double[] {-1, 3, 2});
  System.out.println(v1.crossProduct(v2));

  Vector3D v3 = new Vector3D(new double[] {1, 2, -8});
  Vector3D v4 = new Vector3D(new double[] {-1, -2, 8});
  System.out.println(v3.crossProduct(v4));

  }
}


