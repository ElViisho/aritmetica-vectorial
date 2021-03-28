// ZeroVector Class
import java.io.*;
import java.util.*;


public class ZeroVector extends VectorND{

  //Constructors
  public ZeroVector(double[] newCoords){
    super(newCoords);
    //Make all coordinates 0
    int Ncoords = this.coords.length;
    //Go through all the coordinates
    for(int i=0; i<Ncoords; i++){
      this.coords[i] = 0;
    }
  }
  public ZeroVector(){
    super();
  }

  //Test the results by converting them to string for later printing
  public String toString() {
    return "ZeroVector{" + Arrays.toString(coords) + '}';
  }
  
}