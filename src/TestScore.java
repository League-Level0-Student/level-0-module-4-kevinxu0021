import javax.swing.JOptionPane;

public class TestScore {
public static void main(String[] args) {

	int score = JOptionPane.showOptionDialog(null, "What score did you get on your test?", "Test Score", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"100%", "<100% but >80%", "<80% but >60%", "<60%"}, null);
}				
}
