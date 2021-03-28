// Vector3D Class
import java.io.*;
import java.util.*;

public class Vector3D extends VectorND{

  //Constructors
  public Vector3D(double[] newCoords){
    super(new double[] {newCoords[0], newCoords[1], newCoords[2]});
  }
  public Vector3D(){
    super(new double[] {0, 0, 0});
  }


  //To calculate the croos product between 2 vectors
  public Vector3D crossProduct(Vector3D vector){
    //For easier use
    double[] a = this.coords;
    double[] b = vector.coords;

    //Declaring the new coordinates
    double oneCoord = a[1]*b[2] - a[2]*b[1];
    double twoCoord =  a[0]*b[2] - a[2]*b[0];
    double threeCoord = a[0]*b[1] - a[1]*b[0];

    //Declare the new vector to return
    Vector3D newVec = new Vector3D(new double[] {oneCoord, twoCoord, threeCoord}); 
    return newVec;
  }

  //Test the results by converting them to string for later printing
  public String toString() {
    return "Vector3D{" + Arrays.toString(coords) + '}';
  }
  
}