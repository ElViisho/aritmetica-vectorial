// VectorND Class
import java.io.*;
import java.util.*;
import java.lang.Math.*;


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

  //Test the results by converting them to string for later printing
  public String toString() {
    return "VectorND{" + Arrays.toString(coords) + '}';
  }

  //add method which sums the vectors, coordinate by coordinate
  public VectorND add(VectorND vector){
    //Get the number of coordinates of the vectors
    int Ncoords1 = this.coords.length;
    int Ncoords2 = vector.coords.length;
    //Assing the longest to work with that
    int Ncoords = Math.max(Ncoords1, Ncoords2);

    //Declare the vector that will be returned
    VectorND sumV = new VectorND(new double[Ncoords]);

    //Go through all the coordinates
    //if one vector is over, continue with only the other one
    for (int i=0; i<Ncoords; i++){
      if (i>Ncoords1-1) {
        sumV.coords[i] = vector.coords[i];
      }
      else if (i>Ncoords2-1) {
        sumV.coords[i] = this.coords[i];
      }
      else {
        sumV.coords[i] = this.coords[i] + vector.coords[i];
      }
    }

    return sumV;

  }

  //Get the length of the vector
  public double getLength(){
    //Get the number of coordinates of the vector
    int Ncoords = this.coords.length;

    double length = 0;
    //For each coordinate, sum to the total
    for (int i=0; i<Ncoords; i++){
      length += Math.pow(this.coords[i], 2);
    }

    return Math.sqrt(length);
  }

  //To check wether the vector is a zero vector or not
  public boolean isZeroVector(){
    //Get the number of coordinates of the vector
    int Ncoords = this.coords.length;
    //For each coordinate check if its 0 or not
    for (int i=0; i<Ncoords; i++){
      if (this.coords[i] != 0) {return false;}
    }

    return true;
  }

  //To check wether two vectors are opposite
  public boolean isOppositeTo(VectorND vector){
    //Get the number of coordinates of the vectors
    int Ncoords1 = this.coords.length;
    int Ncoords2 = vector.coords.length;
    //Assing the longest to work with that
    int Ncoords = Math.max(Ncoords1, Ncoords2);

    //For each coordinate check if its opposite or not
    for (int i=0; i<Ncoords; i++){
      if (i>Ncoords1-1) {
        if(vector.coords[i] != 0) {return false;}
      }
      else if (i>Ncoords2-1) {
        if(this.coords[i] != 0) {return false;}
      }
      else {
        if (this.coords[i] != -vector.coords[i]) {return false;}
      }
    }

    return true;
  }

  //To calculate the dot product between two vectors
  public double dotProduct(VectorND vector){
    //Get the number of coordinates of the vectors
    int Ncoords1 = this.coords.length;
    int Ncoords2 = vector.coords.length;
    //Assing the longest to work with that
    int Ncoords = Math.min(Ncoords1, Ncoords2);

    //Declare the vector that will be returned
    double dotV = 0;
    //Go through all the coordinates amd sum the product
    for (int i=0; i<Ncoords; i++){
      dotV += this.coords[i]*vector.coords[i];
    }

    return dotV;

  }
  
}