import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squareFootPrice, length, width;

        // a series of prints statements that prompt the user to input their desired cost/sqft,
        // the length of the room and the width of the room
        System.out.print("Enter the price per square foot: ");
        squareFootPrice = input.nextDouble();
        System.out.print("Enter the length of the room: ");
        length =  input.nextDouble();
        System.out.print("Now enter the width of the room: ");
        width = input.nextDouble();

        RoomDimension roomDimension = new RoomDimension(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, squareFootPrice);

        System.out.println(roomCarpet.toString());
    }
}