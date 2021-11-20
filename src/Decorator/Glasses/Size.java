package Decorator.Glasses;

public enum Size {
   SMALL(5), MEDIUM(8), LARGE(10);

   private double sizeValue;

   Size(double value) {
      sizeValue = value;
   }

   public double getValue(){
      return sizeValue;
   }
}
