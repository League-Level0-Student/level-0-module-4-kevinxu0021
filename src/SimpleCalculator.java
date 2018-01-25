

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String number1word = JOptionPane.showInputDialog("Choose a number.");
Double number1 = Double.parseDouble(number1word);
String number2word = JOptionPane.showInputDialog("Choose another number.");
Double number2 = Double.parseDouble(number2word);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Divide", "Multiply", "Subtract", "Add" },
				null);

		System.out.println(operation);
		if(operation == 3) {
		add(number1,number2);
		}else if(operation == 2) {
			subtract(number1,number2);
		}else if(operation == 1) {
			multiply(number1,number2);
		}else if(operation == 0) {
			divide(number1,number2);
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(double n1, double n2) {
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + ((double)n1+(double)n2));
	}
	static void subtract(double n1, double n2) {
		JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + ((double)n1-(double)n2));
	}
	static void multiply(double n1, double n2) {
		JOptionPane.showMessageDialog(null, n1 + " X " + n2 + " = " + ((double)n1*(double)n2));
	}
	static void divide(double n1, double n2) {
		JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + ((double)n1/(double)n2));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}