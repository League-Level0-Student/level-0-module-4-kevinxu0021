//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int Answer = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
   
if(answer == 1){
	isWeekday = false;
}else{
	isWeekday = true;
}
if(Answer == 1) {
	isVacation = false;
}else{
	isVacation = true;
}

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
if(isWeekday == true && isVacation == true) {
	JOptionPane.showMessageDialog(null, "Sleep in.");
}else if(isWeekday == false && isVacation == true) {
	JOptionPane.showMessageDialog(null, "Sleep in.");
}else if(isWeekday == true && isVacation == false){
	JOptionPane.showMessageDialog(null, "Get up lazybones!");
}else if(isWeekday == false) {
	JOptionPane.showMessageDialog(null, "Sleep in.");
}
    }
}
