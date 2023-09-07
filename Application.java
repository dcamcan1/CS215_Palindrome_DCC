import java.util.Scanner;
import java.util.Stack;

/**A class to test if a user's input String is a palindrome.
 * @author Danny Cannon
 */
public class Application {

	public static void main(String[] args) {

		/** Reading user input. */
		Scanner sc = new Scanner(System.in);
		System.out.print("What string do you want to test? ");
		String userString = sc.nextLine();
		String lowerString = userString.toLowerCase();
		String original = "";
		Stack myStack = new Stack();
		String reverse = "";
		
		/**Iterating through string to remove other characters. */
		for (int i = 0; i < userString.length(); i++) {
			if (lowerString.charAt(i) > 96 && lowerString.charAt(i) < 123) {
				original += lowerString.charAt(i);
			}//end if
		}//end for
		
		/** Pushing all characters from newly edited string to the stack. */
		for (int i = 0; i < original.length(); i++) {
			myStack.push(original.charAt(i));
		}//end for
		
		/** Popping chars from stack and appending to the reverse variable. */
		while (!myStack.isEmpty()) {
			reverse += myStack.pop();
		}//end while
		
		/** Final palindrome check. */
		if (original.equals(reverse)) {
			System.out.println("Congratulations, this is a palindrome!");
		}//end if
		else {
			System.out.println("This is not a palindrome........");
		}//end else
		
	}//end main
}//end class