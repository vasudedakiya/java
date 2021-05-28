public class Rectangle {

   public static void main(String[] args) {

      RectangleClass r1 = new RectangleClass(7, 6);
      r1.PrintRectangle();
      r1.getarea();
      r1.getperimeter();

      RectangleClass r2 = new RectangleClass();
      r2.PrintRectangle();
      r2.getarea();
      r2.getperimeter();

   }
}

class RectangleClass {
   double hight;
   double width;
   double area;
   double perimeter;

   public RectangleClass() {
      this.hight = 6.0D;
      this.width = 6.0D;
   }

   public RectangleClass(double var1, double var3) {
      this.hight = var1;
      this.width = var3;
   }

   public void PrintRectangle() {
      for (int var1 = 0; (double) var1 < this.hight; ++var1) {
         for (int var2 = 0; (double) var2 < this.width; ++var2) {
            if (var2 != 0 && (double) var2 != this.width - 1.0D && var1 != 0 && (double) var1 != this.hight - 1.0D) {
               System.out.print("  ");
            } else {
               System.out.print("* ");
            }
         }

         System.out.println("");
      }

   }

   public void getarea() {
      this.area = this.hight * this.width;
      System.out.println("area is " + this.area);
   }

   public void getperimeter() {
      this.perimeter = 2.0D * (this.hight + this.width);
      System.out.println("perimeter is " + this.perimeter);
   }
}
