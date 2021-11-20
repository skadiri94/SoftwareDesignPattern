package Decorator.Glasses;

public enum Cost {
    ANTI_REFLECTIVE(18),BLUE_LIGHT(19), POLARIZED(20),
    POLYCARBONATE(21),CAT_EYE_FRAME(50),ROUND_FRAME(45), SQUARE_FRAME(48);
private double costValue;

  Cost(double value) {
        costValue = value;
    }

    public double getValue(){
        return costValue;
    }
}
