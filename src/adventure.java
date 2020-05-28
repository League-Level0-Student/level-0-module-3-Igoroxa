import javax.swing.JOptionPane;

public class adventure {
	public static void main(String[] args) {
		String question1 = JOptionPane
				.showInputDialog("Recieve a used $1,000,000 car or recieve a new $25,000 car (say 1 or 2)");
		if (question1.equals("1")) {
			String question2 = JOptionPane.showInputDialog("DO WANT TO RIDE IN IT?");
			if (question2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null,
						"UNFORTUANTLY UR CAR EXPLODED BECAUSE IT WAS A USED CAR. TO WIN U HAD TO SELL IT RIGHT AWAY AND THE BOMB WOULD EXPIRE AFTER THE TRANSACTION.");
			}
				else if (question2.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "JACKPOT YOU HAVE ERANED YOURSELF 1,000,000 DOLLARS WITHOUT HARM.");
				}	}
			
		
		if (question1.equals("2")){
			String question3 = JOptionPane.showInputDialog("DO YOU WANT TO SELL IT OR KEEP IT");
			
		
		if (question3.equalsIgnoreCase("keep")) {
			JOptionPane.showMessageDialog(null, "CONGRATUILATIONS YOU HAVE EARNED YOURSELF A BRAND NEW 25K CAR!");
		}
		else {
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS YOU HAVE EARNED 25K");
		}
	
		}
		}
		

}
