import java.util.Scanner;
/**
* Creating the main function.
*
* @author Ketia Gaelle Kaze
* @version 1.0
* @since 2022-04-25
*/

final class Main {

    /**
    * Choice to exit the program.
    */
    public static final String exit = "X";
    /**
    * Choice to push method.
    */
    public static final String push = "PUSH";
    /**
    * Choice to pop method.
    */
    public static final String pop = "POP";
    /**
    * Choice to integer stack.
    */
    public static final String integer = "INTEGER";
    /**
    * Choice to string stack.
    */
    public static final String string = "STRING";

    /**
    * Creating an empty default constructor.
    */

    private Main() { }

    /**
    * Creating a main function.
    *
    * @param args nothing passed in.
    *
    */

    public static void main(String[] args) {

        // Declaring variables
        Scanner sc = new Scanner(System.in);
        String userChoice1;
        String userChoice2;
        String userInput1;
        String userInput2;
        int inputInt;

        // creating an object for the integer stack
        MyIntStack myIntStack = new MyIntStack();

        // creating an object for the string stack
        MyStringStack myStringStack = new MyStringStack();

        System.out.println("\nWelcome to the push method!");
        System.out.print("If you would like to push, enter PUSH, "
            + "if you would like to exit, enter X: ");
        userChoice1 = sc.nextLine();
        userChoice1 = userChoice1.toUpperCase();

        // Condition for when the user chooses to push.
        if (userChoice1.equals(push)) {
            System.out.println("\nMore options to choose from!!!");
            System.out.print("If you would like to use an integer stack, "
                 + "enter INTEGER, "
                    + "if you would like to use a string stack, "
                        + "enter STRING, if you would like to exit, enter X: ");
            userChoice2 = sc.nextLine();
            userChoice2 = userChoice2.toUpperCase();

            if (userChoice2.equals(integer)) {
                System.out.print("\nPlease enter an integer: ");
                userInput1 = sc.nextLine();
                // catch error when a non-integer is entered.
                try {
                    inputInt = Integer.parseInt(userInput1);

                    // push the user input to the integer stack.
                    myIntStack.push(inputInt);
                } catch (IllegalArgumentException exception) {
                    System.out.println("\n" + userInput1 + " is not a "
                        + "valid integer.");
                }

            // condition for when the user chooses to use the string stack.
            } else if (userChoice2.equals(string)) {
                System.out.print("\nPlease enter a string: ");
                userInput2 = sc.nextLine();

                // push the input to the string stack.
                myStringStack.push(userInput2);

                // condition for when the user wants to exit the program.
            } else if (userChoice2.equals(exit)) {
                System.out.println("\nProgram terminated.");

            // condition for when the user enters an invalid input.
            } else {
                System.out.println("\n" + userChoice2 + " is not "
                    + "among the choices.");
            }
        }
    }
}
