public class Vector3D extends VectorND{

  //Constructors
  public Vector3D(double[] newCoords){
    super(new double[] {newCoords[0], newCoords[1], newCoords[2]});
  }
  public Vector3D(){
    super(new double[] {0, 0, 0});
  }
  
}