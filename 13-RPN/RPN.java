import java.io.*;
import java.util.*;

public class RPN {

    private static MyStack stack = new MyStack();

    public static Double calculate(String s) {
	Double tmp1 = stack.pop();
	Double tmp2 = stack.pop();
	Double ans = 0.0;
	if (s.equals("+")) {
	    ans = tmp1+tmp2;
	}
	else if (s.equals("-")) {
	    ans = tmp1-tmp2;
	}
	else if (s.equals("*")) {
	    ans = tmp1*tmp2;
	}
	else if (s.equals("/")) {
	    ans = tmp1/tmp2;
	}
	stack.push(ans);
	return ans;
    }

    // returns an exception if less than two elements are in the array
    // returns an exception if anything other than "clear", "stop",numbers,
    // and operators are entered in
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Instructions:");
	System.out.println("Enter numbers and an operation. If you want to clear the stack, type and enter in 'clear'. If you want to exit, type and enter in 'stop'.");
	String input = scan.nextLine();
	while (!input.equals("stop")) {
	    if (input.equals("+") || input.equals("-") 
		|| input.equals("*") || input.equals("/")) {
		System.out.println(calculate(input));
	    }
	    else if (input.equals("clear")) {
		stack = new MyStack();
	    }

	    else {
		Double tmpD = Double.parseDouble(input);
		stack.push(tmpD);
	    }
	    System.out.println("Current stack: " + stack);
	    input = scan.nextLine();
	}
    }
}
