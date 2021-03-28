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
  
}