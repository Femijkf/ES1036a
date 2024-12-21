public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost) {
        size = dim;
        carpetCost = cost;
    }

    // getTotalCost method that takes into account the area of the room and multiplies it by the users
    // cost per square foot or area
    public double getTotalCosst() {
        double costPerSqFt;
        costPerSqFt = (carpetCost*size.getArea());
        return costPerSqFt;
    }

    // toString method takes in the toString method from the RoomDimension class and concatenates it
    // with the calculated total cost to for one single returned string statement
    public String toString() {
        return "Room Dimension: \n" + size.toString() + "\nCarpet Cost: $" + getTotalCosst() + "0";
    }
}