import java.util.*;

/**
* Program implements the push method.
*
* @author Ketia Gaelle Kaze
* @version 1.0
* @since 2022-04-25
*/

public class MyIntStack {
    /**
    * Declaring properties.
    */
    private Stack<Integer> _stack;

    /**
    * Creating a constructor.
    */
    public MyIntStack() {
        _stack = new Stack<Integer>();

    }

    /**
    * Creating a function that adds an integer to the stack.
    *
    * @param num passed
    */

    public void push(int num) {
        _stack.push(num);
        System.out.println("\n" + num + " added to the top of the stack.");
        System.out.println("The size of the stack is " + _stack.size());
    }
}
