import java.util.*;

/**
* Program implements the push method.
*
* @author Ketia Gaelle Kaze
* @version 1.0
* @since 2022-04-25
*/
public class MyStringStack {
    /**
    * Declaring properties.
    */
    private Stack<String> _stack;

    /**
    * Creating a constructor.
    */
    public MyStringStack() {
        _stack = new Stack<String>();

    }
    /**
    * Creating a function that adds an integer to the stack.
    *
    * @param str passed in
    */

    public void push(String str) {

        _stack.push(str);
        System.out.println("\n" + str + " added to the top of the stack.");
        System.out.println("The size of the stack is " + _stack.size());
    }

}
