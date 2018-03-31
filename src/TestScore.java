import javax.swing.JOptionPane;

public class TestScore {
public static void main(String[] args) {

	int score = JOptionPane.showOptionDialog(null, "What score did you get on your test?", "Test Score", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"100%", "<100% but >80%", "<80% but >60%", "<60%"}, null);
System.out.println(score);
	if(score == 0) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}else if(score == 1) {
	JOptionPane.showMessageDialog(null, "You did study for the test.");
}else if(score == 2) {
	JOptionPane.showMessageDialog(null, "You did not study for the test.");
}else {
	JOptionPane.showMessageDialog(null, "You do not know anything!");
}





















}
}
