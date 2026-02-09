
import java.util.Scanner;

/**
 * A simple menu-driven program that converts temperatures between Fahrenheit
 * and Celsius using integer-returning conversion methods.
 *
 * @author bcanada@uscb.edu
 * @version 146sp26 Homework 2 problem 5-13
 */
public class TemperatureConverterApp {

    /**
     * Displays a menu that allows the user to convert temperatures between
     * Fahrenheit and Celsius until the user chooses to exit.
     *
     * @param args command-line arguments (note: not used here)
     */
    public static void main(String[] args) {
        /* INITIALIZATION PHASE */
        Scanner input = new Scanner(System.in);

        int choice; // the user's choice in the menu

        /* PROCESSING PHASE */
        do {
            // print the menu
            System.out.println("1. Convert a Fahrenheit temperature to Celsius");
            System.out.println("2. Convert a Celsius temperature to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println();

            System.out.print("Choice: ");
            choice = input.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter temperature: ");
                int startingTemperature = input.nextInt();

                // convert the temperature appropriately
                switch (choice) {
                    case 1:
                        System.out.printf("%d degrees Fahrenheit is %d degrees Celsius%n%n",
                                startingTemperature, celsius(startingTemperature));
                        break;
                    case 2:
                        System.out.printf("%d degrees Celsius is %d degrees Fahrenheit%n%n",
                                startingTemperature, fahrenheit(startingTemperature));
                        break;
                    default:
                        // no action needed; handled by the if-condition
                        break;
                }
            }
        } while (choice != 3);

        /* TERMINATION PHASE */
        System.out.println("Exiting program -- Goodbye!");
    } // end method main

    /**
     * Returns the Celsius equivalent of a Fahrenheit temperature, using:
     * celsiusTemperature = 5.0 / 9.0 * (fahrenheitTemperature - 32)
     *
     * @param fahrenheitTemperature the temperature in degrees Fahrenheit
     * @return the converted temperature in degrees Celsius (as an int)
     */
    public static int celsius(int fahrenheitTemperature) {
        return (int) (5.0 / 9.0 * (fahrenheitTemperature - 32));
    } // end method celsius

    /**
     * Returns the Fahrenheit equivalent of a Celsius temperature, using:
     * fahrenheitTemperature = 9.0 / 5.0 * celsiusTemperature + 32
     *
     * @param celsiusTemperature the temperature in degrees Celsius
     * @return the converted temperature in degrees Fahrenheit (as an int)
     */
    public static int fahrenheit(int celsiusTemperature) {
        return (int) (9.0 / 5.0 * celsiusTemperature + 32);
    } // end method fahrenheit

} // end class TemperatureConverterApp
