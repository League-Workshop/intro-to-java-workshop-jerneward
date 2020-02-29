package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		Random ran = new Random();
		int randomNumber = ran.nextInt(4);
		// 3. Print out this variable
		System.out.println(randomNumber);
		// 4. Get the user to enter something that they think is awesome
String awesome = JOptionPane.showInputDialog("Enter something you think is awesome."); 
		// 5. If the random number is 0
if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, awesome + " is awesome!");
}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, awesome + " is ok.");
}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
else if (randomNumber == 2) { 
	JOptionPane.showMessageDialog(null, awesome + " is boring...");
}
		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
else { 
	JOptionPane.showMessageDialog(null, awesome + " isn't awesome, but it's pretty darn cool.");
	
}
// -- write your own answer
	}
}
