public class Temperature {
    private double fTemp;

    public Temperature(double far) {
        fTemp = far;
    }

    // setter will be used to change the variable value later on if needed
    public void setFahrenheit(double f) {
        fTemp = f;
    }

    public double getFahrenheit() {
        return fTemp;
    }

    public double getCelsius() {
        double celsius = (5.0/9.0)*(fTemp-32);
        return celsius;
    }

    public double getKelvin() {
        double kelvin = ((5.0/9.0)*(fTemp-32)) + 273;
        return kelvin;
    }
}
