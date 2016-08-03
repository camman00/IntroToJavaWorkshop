package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello there, what is your name?");
		JOptionPane.showMessageDialog(null, name + " you are very awesome!");
		String answer = JOptionPane.showInputDialog("What do you like better tacos or pizza?");
		if (answer.equals("tacos")) {
			JOptionPane.showMessageDialog(null, "Yuck!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "I agree!");
		}
		
	}

}
