public class RoomDimension {
    private double length;
    private double width;

    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }

    // getArea method which calculates the area of the room
    public double getArea() {
        double area;
        area = length*width;

        return area;
    }

    // toString method that returns a string composed of the chosen length, width and calculated area
    public String toString() {
        return "Length: " + length + " Width: " + width + " Area: " + getArea();
    }
}