package Decorator.Noodle;

public enum Price {
   UDO(1.9), BASICNOODLE(2);


   private final double value;
   Price(double value) { this.value = value; }
   public double getValue() { return value; }
}
