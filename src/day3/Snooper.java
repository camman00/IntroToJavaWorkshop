package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name!");
		String live = JOptionPane.showInputDialog("Cool " + name + " where do you live?");
		String confirm = JOptionPane.showInputDialog("Are you sure you live at " + live);
		if (confirm.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you made a big mistake :D");
		}
		else {
			JOptionPane.showMessageDialog(null, name + " it seems to me that you have lied! You are a LIAR!");
		}
		JOptionPane.showMessageDialog(null, "The only way to make up for your mistakes is to enter in your credit card number!");
		String creditcard = JOptionPane.showInputDialog(" ");
		JOptionPane.showMessageDialog(null, "Thanks for the credit card : " + creditcard);
		JOptionPane.showMessageDialog(null, "Ok " + name + " I am watching you....");
		JOptionPane.showMessageDialog(null, "Im always watching you.............. 24 ........ / ..... 7");
		for (int i = 0; i < 100; i++) {
			System.out.println("24/7");
			
		}
	}

}