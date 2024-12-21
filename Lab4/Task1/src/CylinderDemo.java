import java.util.Scanner;

public class CylinderDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // The following 4 lines will ask the user for the radius and height of a cylinder with a print statement
        // and read the keyboard with Scanner
        double x, y;

        System.out.print("Enter the radius of a cylinder: ");
        x = input.nextDouble();
        System.out.print("Enter the height of a cylinder: ");
        y = input.nextDouble();
        Cylinder cylinder = new Cylinder(x, y);

        System.out.printf("The cylinder's radius is %.1f\n", cylinder.getRadius());
        System.out.printf("The cylinder's height is %.1f\n", cylinder.getHeight());
        System.out.println("The cylinder's volume is " + cylinder.getVolume());
        System.out.println("The cylinder's curved surface area is " + cylinder.getCurvedSurfaceArea());
        System.out.println("The cylinder's total surface area is " + cylinder.getTotalSurfaceArea());

    }
}
