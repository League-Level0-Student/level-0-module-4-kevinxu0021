import java.util.Scanner;

public class TextAdventure {
public static void main(String[] args) {
System.out.println("You are locked in a car, what do you do?");	
Scanner scanner = new Scanner(System.in);
String ans1 = scanner.nextLine();
if(ans1.equalsIgnoreCase("Start the car")) {
	System.out.println("You don't have the key, you lost.");
}else if(ans1.equalsIgnoreCase("Open the door")) {
	System.out.println("The door is locked, you lost");
}else if(ans1.equalsIgnoreCase("Go to the backseat")) {
	 System.out.println("You found a tool to break the glass.");
	 String ans2 = scanner.nextLine();
	 if(ans2.equalsIgnoreCase("Break the glass")) {
		 System.out.println("Someone found you, you died.");
	 }else {
		 System.out.println("You lost.");
	 }
}
}
}
