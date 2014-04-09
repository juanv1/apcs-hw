import java.io.*;
import java.util.*;

public class RPN {

    private static MyStack stack = new MyStack();

    public static void calculate() {
	System.out.println("Instructions:");
	System.out.println("Enter numbers and an operation. If you want to clear the stack, type and enter in 'clear'. If you want to see the stack, type and enter in 'seeStack'. If you want to exit, type and enter in 'stop'.");

	// Scanner that takes user input
	Scanner scan = new Scanner(System.in);

	// input holds the most recent entry
	String input = scan.nextLine();

	// as long as "stop" is not the input, calculate continues looping
	while (!input.equals("stop")) {
	    // if the input is an operator...
	    if (input.equals("+") || input.equals("-") 
		|| input.equals("*") || input.equals("/")) {
		try { // try to see if there is one number in the stack...
		    Double tmp1 = stack.pop();
		    try { // if there is one number in the stack, test to see
			// if there is also a second number in the stack
			Double tmp2 = stack.pop();
			// if there are two numbers in the stack, solve and push the result back into the stack
			if (input.equals("+")) {
			    stack.push(tmp1+tmp2);
			}
			else if (input.equals("-")) {
			    stack.push(tmp1-tmp2);
			}
			else if (input.equals("*")) {
			    stack.push(tmp1*tmp2);
			}
			else if (input.equals("/")) {
			    stack.push(tmp1/tmp2);
			}
			// print out the result
			System.out.println(stack.peek());
		    } catch (ArrayIndexOutOfBoundsException e) {
			// if there is only one number in the stack and not two
			// push back the one number since we popped it but didn't use it
			System.out.println("Not enough operands");
			stack.push(tmp1);
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
		    // if there are no numbers in the stop, print out the problem instead of having an exception
			System.out.println("Not enough operands");
		}
	    }
	    // clears the stack
	    else if (input.equals("clear")) {
		stack = new MyStack();
	    }
	    // prints out the stack
	    else if (input.equals("seeStack")) {
		System.out.println(stack);
	    }
	    else {
		try { // test to see if the input is a Double
		Double tmpD = Double.parseDouble(input);
		stack.push(tmpD);
		} catch (NumberFormatException e) {
		    System.out.println("Enter a number");
		}
	    }
	    // after the input is checked through the if statements
	    // take in another input to continue the loop
	    input = scan.nextLine();
	}
    }
    
    // driver
    public static void main(String[] args) {
	calculate();
    }
}
