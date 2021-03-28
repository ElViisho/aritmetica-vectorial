// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;


public class VectorND{
  //Declare the array where coordinates will be stored
  protected double[] coords;

  //Constructors
  public VectorND(double[] newCoords){
    this.coords = newCoords;
  }
  public VectorND(){
    this.coords = new double[0];
  }


  public String toString() {
    return "VectorND{" + Arrays.toString(coords) + '}';
  }


  public VectorND add(VectorND vector){
    int length1 = this.coords.length;
    int length2 = vector.coords.length;

    int length = (length1 > length2)? length1 : length2;

    VectorND sumV = new VectorND(new double[length]);

    for (int i=0; i<length; i++){
      if (i>length1-1) {
        sumV.coords[i] = vector.coords[i];
      }
      else if (i>length2-1) {
        sumV.coords[i] = this.coords[i];
      }
      else {
        sumV.coords[i] = this.coords[i] + vector.coords[i];
      }
    }

    return sumV;

  }
  
}