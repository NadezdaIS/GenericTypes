package drinks;

public class Tea {
    public final double milkMeasurement;
    public final double noOfTeaBags;
    public final TeaType teaType;


    public Tea(double milkMeasurement, double noOfTeaBags, TeaType teaType) {
        this.milkMeasurement = milkMeasurement;
        this.noOfTeaBags = noOfTeaBags;
        this.teaType = teaType;
    }

    @Override
    public String toString() {
        return " Tea " +
                "with milk " + milkMeasurement + " kg" +
                " with tea bags" + noOfTeaBags + "kg " +
                " and the type is " + teaType + " tea";

    }
}
