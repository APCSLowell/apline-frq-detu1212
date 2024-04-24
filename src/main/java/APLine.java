public class APLine
{
  private double a1, b1, c1;
  public APLine(int a, int b, int c){
    this.a1 = a;
    this.b1 = b;
    this.c1 = c;
  }
  public double getShape(){
    return - (this.a1/this.b1);
  }
  public boolean isOnLine (int x, int y){
    return (0==(this.a * x) + (this.b * y) + this.c);
  }
  
}
