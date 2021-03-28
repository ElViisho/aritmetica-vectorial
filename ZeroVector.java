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
  
}