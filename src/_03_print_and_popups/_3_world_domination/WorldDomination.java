package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to wrtite code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world.");
		}
		else {
			JOptionPane.showMessageDialog(null, "sign up for the league classes");
			
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		
	}
}

