// Vector2D Class
import java.io.*;
import java.util.*;

public class Vector2D extends VectorND{

  //Constructors
  public Vector2D(double[] newCoords){
    super(new double[] {newCoords[0], newCoords[1]});
  }
  public Vector2D(){
    super(new double[] {0,0});
  }

  //Test the results by converting them to string for later printing
  public String toString() {
    return "Vector2D{" + Arrays.toString(coords) + '}';
  }
  
}