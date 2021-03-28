public class Vector2D extends VectorND{

  //Constructors
  public Vector2D(double[] newCoords){
    super(new double[] {newCoords[0], newCoords[1]});
  }
  public Vector2D(){
    super(new double[] {0,0});
  }
  
}