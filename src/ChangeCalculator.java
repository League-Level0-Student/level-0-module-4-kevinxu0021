//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String NickelNumberWord = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int NickelNumber = Integer.parseInt(NickelNumberWord);
		// Ask the user how many dimes they have, and convert their answer
		String DimeNumberWord = JOptionPane.showInputDialog("How many dimes do you have?");
		int DimeNumber = Integer.parseInt(DimeNumberWord);
		// Ask the user how many quarters they have, and convert their answer
		String QuarterNumberWord = JOptionPane.showInputDialog("How many quarters do you have?");
		int QuarterNumber = Integer.parseInt(QuarterNumberWord);
		
		String Money = JOptionPane.showInputDialog("How much money do you have exept for coins?");
		int MoneyNumber = Integer.parseInt(Money);
		
		// Calculate how much money the user has and save it in a double variable 
		double NickelTotal = NickelNumber * 0.05;
		double DimeTotal = DimeNumber * 0.10;
		double QuarterTotal = QuarterNumber * 0.25;
		double MoneyTotal = MoneyNumber * 1;
		double TotalMoney = NickelTotal + DimeTotal + QuarterTotal;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, TotalMoney);
	}
}

