public class Cylinder {
    private double radius;
    private double height;
    private double PI = 3.14159;

    public Cylinder(double rad, double hei) {
        radius = rad;
        height = hei;
    }

    // setter will be used to change the variable value later on if needed
    public void setRadius(double r) {
        radius = r;
    }

    // setter will be used to change the variable value later on if needed
    public void setHeight(double h) {
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume = PI*radius*radius*height;
        return volume;
    }
    public double getCurvedSurfaceArea() {
        double curvedSurfaceArea = 2*PI*radius*height;
        return curvedSurfaceArea;
    }

    public double getTotalSurfaceArea() {
        double totalSurfaceArea = 2*PI*radius*(height+radius);
        return totalSurfaceArea;
    }
}
