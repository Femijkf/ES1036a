import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit temperature: ");
        Temperature temperature = new Temperature(input.nextDouble());
        System.out.printf("Celsius: %.2f\n", temperature.getCelsius());
        System.out.printf("Kelvin: %.2f", temperature.getKelvin());
    }
}
