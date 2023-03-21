package drinks;

public class Coffee {
    public double milkMeasurement;
    public double sugarMeasurement;
    public double coffeeBeanMeasurement;

    public Coffee(double milkMeasurement, double sugarMeasurement, double coffeeBeanMeasurement) {
        this.milkMeasurement = milkMeasurement;
        this.sugarMeasurement = sugarMeasurement;
        this.coffeeBeanMeasurement = coffeeBeanMeasurement;
    }

    @Override
    public String toString() {
        return "Coffee, with " +
                "\nmilk " + milkMeasurement + " kg" +
                "\nsugar " + sugarMeasurement + " kg" +
                "\ncoffee " + coffeeBeanMeasurement + " kg";
    }
}
