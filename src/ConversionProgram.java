import java.util.Scanner;

// INFO: Ch. 5 Challenge 3: Conversion Program
// INFO: main is already written, and it is broken into methods that don't
//       exist yet. You write six methods below main.
// INFO: There are no documentation comments this time. Work out each
//       method's header from its call in main: what goes in, and what
//       comes back. Every method in this chapter is public static.
// INFO: The calls in main are commented out. After you write a method,
//       uncomment its call, run the program, and check the output.
//       To uncomment several lines, select them and press Ctrl + /.
// INFO: Lines marked GIVEN are provided. Do not change them.

public class ConversionProgram {

    public static void main(String[] args) {
        // GIVEN: The Scanner, the distance, and the menu choice.
        Scanner keyboard = new Scanner(System.in);
        int meters = 0;
        int choice = 0;

        // TODO 1 (call): Uncomment the line below after you write getDistance.
        // meters = getDistance(keyboard);

        // GIVEN: Show the menu until the user chooses 4.
        while (choice != 4) {
            System.out.println();

            // TODO 2 (call): Uncomment the line below after you write showMenu.
            // showMenu();

            // GIVEN: Read a choice, and read it again until it's 1 through 4.
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            while (choice < 1 || choice > 4) {
                System.out.print("Invalid selection. Enter your choice: ");
                choice = keyboard.nextInt();
            }

            // GIVEN: Run the conversion the user chose.
            switch (choice) {
                case 1:
                    // TODO 4 (call): Uncomment the two lines below after you
                    //                write calcKilometers. TODO 3 must be done.
                    // double kilometers = calcKilometers(meters);
                    // showResult(meters, kilometers, "kilometers");
                    break;
                case 2:
                    // TODO 5 (call): Uncomment the two lines below after you
                    //                write calcFeet.
                    // double feet = calcFeet(meters);
                    // showResult(meters, feet, "feet");
                    break;
                case 3:
                    // TODO 6 (call): Uncomment the two lines below after you
                    //                write calcInches.
                    // double inches = calcInches(meters);
                    // showResult(meters, inches, "inches");
                    break;
                case 4:
                    System.out.println("Thank you. Have a nice day!");
                    break;
            }
        }

        // GIVEN: Close the keyboard and the program.
        keyboard.close();
        System.exit(0);
    }

    // TODO 1 (method): Write the getDistance method.
    //   Kind:    input method
    //   Its job: print the prompt "Enter a distance in meters: " so the user
    //            types on the same line, read a whole number with the Scanner
    //            it receives, and send that number back.
    //   Header:  work it out from the TODO 1 call in main.


    // TODO 2 (method): Write the showMenu method.
    //   Kind:    output method
    //   Its job: print the four menu options, one per line:
    //              1. Convert to kilometers
    //              2. Convert to feet
    //              3. Convert to inches
    //              4. Quit the program
    //   Header:  work it out from the TODO 2 call in main.


    // TODO 3 (method): Write the showResult method.
    //   Kind:    output method
    //   Its job: print one line: [meters] meters is [result] [unit].
    //            For example: 500 meters is 0.5 kilometers.
    //   Header:  work it out from the showResult calls under TODO 4, 5,
    //            and 6 in main.
    //   INFO:    showResult is first called in TODO 4, so you'll test it
    //            when you finish TODO 4.


    // TODO 4 (method): Write the calcKilometers method.
    //   Kind:    calculation method (no printing)
    //   Its job: send back the kilometers: meters * 0.001
    //   Header:  work it out from the TODO 4 call in main.


    // TODO 5 (method): Write the calcFeet method.
    //   Kind:    calculation method (no printing)
    //   Its job: send back the feet: meters * 3.281
    //   Header:  work it out from the TODO 5 call in main.


    // TODO 6 (method): Write the calcInches method.
    //   Kind:    calculation method (no printing)
    //   Its job: send back the inches. A foot is 12 inches, so call
    //            calcFeet and multiply what it sends back by 12.
    //            Don't use a new conversion number.
    //   Header:  work it out from the TODO 6 call in main.
    //   INFO:    This is a method that calls a method. calcInches waits
    //            for calcFeet to send its value back, then finishes.


}
