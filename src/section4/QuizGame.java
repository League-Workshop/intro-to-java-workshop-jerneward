package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String a = JOptionPane.showInputDialog("Are you over the age of 13?");
		// 3. Use an if statement to check if their answer is correct
		if (a.equalsIgnoreCase("yes")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You do not qualify");
		}
		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String b = JOptionPane.showInputDialog("Is your GPA higher than 3.5?");
		if (b.equalsIgnoreCase("yes")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You do not qualify");
		}
		String c = JOptionPane.showInputDialog("Do you play any sports?");
		if (c.equalsIgnoreCase("yes")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You do not qualify.");
		}
		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "If you answered yes to all of these questions, your score is: " + score);
	}
}
