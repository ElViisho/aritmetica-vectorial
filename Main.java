// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

class Main{
  public static void main(String[ ] args) {

  System.out.println("Defining Vectors2D:  v2_1=(1,2); v2_2=(5,1,3,7);");
  Vector2D v2_1 = new Vector2D(new double[] {1, 2});
  Vector2D v2_2 = new Vector2D(new double[] {5, 1, 3, 7});
  System.out.println("  v2_1: " + v2_1);
  System.out.println("  v2_2: " + v2_2 + "\n");

  System.out.println("Defining Vectors3D:  v3_1=(-1,6,3); v3_2=(5,0,9,3,7,5,1); v3_3=(1,-6,-3);");
  Vector3D v3_1 = new Vector3D(new double[] {-1, 6, 3});
  Vector3D v3_2 = new Vector3D(new double[] {5, 0, 9, 3, 7, 5, 1});
  Vector3D v3_3 = new Vector3D(new double[] {1, -6, -3});
  System.out.println("  v3_1: " + v3_1);
  System.out.println("  v3_2: " + v3_2);
  System.out.println("  v3_3: " + v3_3 + "\n");

  System.out.println("Defining VectorsND:  vn_1=(0,0,0,0,0,0); vn_2=(3,4,-8,-1,0,0,0); vn_3=(-3,-4,8,1);");
  VectorND vn_1 = new VectorND(new double[] {0, 0, 0, 0, 0, 0});
  VectorND vn_2 = new VectorND(new double[] {3, 4, -8, -1, 0, 0, 0});
  VectorND vn_3 = new VectorND(new double[] {-3, -4, 8, 1});
  System.out.println("  vn_1: " + vn_1);
  System.out.println("  vn_2: " + vn_2);
  System.out.println("  vn_3: " + vn_3 + "\n");

  System.out.println("Defining ZeroVectors:  v0_1=(0); vn_2=(1,5,7,8,1,3,6);");
  ZeroVector v0_1 = new ZeroVector(new double[] {0});
  ZeroVector v0_2 = new ZeroVector(new double[] {1, 5, 7, 8, 1, 3,6});
  System.out.println("  v0_1: " + v0_1);
  System.out.println("  v0_2: " + v0_2 + "\n");

  System.out.println("Sums of vectors:  vs_1=(v2_1+v2_2); vs_2=(v2_1+v3_2); vs_3=(vn_3+v0_2);");
  VectorND vs_1 = v2_1.add(v2_2);
  VectorND vs_2 = v2_1.add(v3_2);
  VectorND vs_3 = vn_3.add(v0_2);
  System.out.println("  vs_1: (1,2) + (5,1) = " + vs_1);
  System.out.println("  vs_2: (1,2) + (5, 0, 9) = " + vs_2);
  System.out.println("  vs_3: (-3,-4,8,1) + (0,0,0,0,0,0,0) = " + vs_3 + "\n");

  System.out.println("Length of vectors:  l_1=length(v2_1); l_2=length(v3_1);");
  double l_1 = v2_1.getLength();
  double l_2 = v3_1.getLength();
  System.out.println("  l_1: length(1,2) = " + l_1);
  System.out.println("  l_1: length(-1,6,3) = " + l_2 + "\n");

  System.out.println("Is vector zero:  is0_1=isZero(v3_2); is0_2=isZero(vn_1); is0_3 = isZero(v0_1);");
  boolean is0_1 = v3_2.isZeroVector();
  boolean is0_2 = vn_1.isZeroVector();
  boolean is0_3 = v0_1.isZeroVector();
  System.out.println("  is0_1: isZero(5,0,9) = " + is0_1);
  System.out.println("  is0_2: isZero(0,0,0,0,0,0) = " + is0_2);
  System.out.println("  is0_3: isZero(0) = " + is0_3 + "\n");

  System.out.println("Is vector opposite from other:  isOp_1=v2_2.isOpposite(v0_2); isOp_2=vn_2.isOpposite(vn_3);");
  boolean isOp_1 = v2_2.isOppositeTo(v0_2);
  boolean isOp_2 = vn_2.isOppositeTo(vn_3);
  System.out.println("  isOp_1: (5,1) and (0,0,0,0,0,0,0) = " + isOp_1);
  System.out.println("  isOp_2: (3,4,-8,-1,0,0,0) and (-3,-4,8,1) = " + isOp_2 + "\n");

  System.out.println("Dot product between 2 vectors:  dot_1=vn_2*v2_1; dot_2=v0_2*vn_2; dot3=vs_2*v3_2");  
  double dot_1 = vn_2.dotProduct(v2_1);
  double dot_2 = v0_2.dotProduct(v3_2);
  double dot_3 = vs_2.dotProduct(v3_3);
  System.out.println("  dot_1: (3,4,-8,-1,0,0,0)*(1,2) = " + dot_1);
  System.out.println("  dot_2: (0,0,0,0,0,0,0)*(5,0,9) = " + dot_2);
  System.out.println("  dot_3: (6,2,9)*(1,-6,-3) = " + dot_3 + "\n");

  System.out.println("cross product between 2 vectors3D:  cross_1=(v3_1)x(v3_2); cross_2=(v3_1)x(v3_3); cross_2=(v3_2)x(v3_1);");  
  Vector3D cross_1 = v3_1.crossProduct(v3_2);
  Vector3D cross_2 = v3_1.crossProduct(v3_3);
  Vector3D cross_3 = v3_2.crossProduct(v3_1);
  System.out.println("  cross_1: (-1,6,3)x(5,0,9) = " + cross_1);
  System.out.println("  cross_2: (-1,6,3)x(1,-6,-3) = " + cross_2);
  System.out.println("  cross_3: (5,0,9)x(-1,6,3) = " + cross_3 + "\n");

  }
}


