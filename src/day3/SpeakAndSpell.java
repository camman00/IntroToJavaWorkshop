package day3;
//RUN THE APP :D

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		/*
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("hello");
		// 2. Catch the user's answer in a String
		String catch_ = JOptionPane.showInputDialog("Spell it!");
		// 3. If the user spelled the word correctly, speak "correct"
		if (catch_.equals("hello")) {
			speak("Correct!");
		}
		else {
			speak("Incorrect!");
		}*/
		String one = "Millennium";
		String two = "Convalesce";
		String three = "Arctic";
		String four = "Deductible";
		String five = "Cameroon";
		speak(one);
		CatchIt(one);
		speak(two);
		CatchIt(two);
		speak(three);
		CatchIt(three);
		speak(four);
		CatchIt(four);
		speak(five);
		CatchIt(five);
		
		
		
		

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void CatchIt(String s) {
		String answer = JOptionPane.showInputDialog("Spell It!");
		if (s.equalsIgnoreCase(answer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}

}


