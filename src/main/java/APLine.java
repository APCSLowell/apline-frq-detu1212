public class APLine
{
 private double a1, b1, c1;
 public APLine(int a, int b, int c) {
 this.a1 = a;
 this.b1 = b;
 this.c1 = c;
 }
 public double getSlope() {
 return -(this.a1 / this.b1);
 }
 public boolean isOnLine(int x, int y) {
 return (0 == (this.a1 * x) + (this.b1 * y) + this.c1);
 }
}
