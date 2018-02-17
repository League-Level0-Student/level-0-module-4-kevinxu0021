//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int happinessLevel = 0;
static String userPet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
 userPet = JOptionPane.showInputDialog(null, "What pet do you want to buy?", "Happy Pet", JOptionPane.INFORMATION_MESSAGE);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (;happinessLevel < 25;) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).\
				
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Hit Your Pet","Clean Up Poop", "Food", "Water", "Take a Walk" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
if(task == 4) {
	takeAWalk();
}else if(task == 3) {
	Water();
}else if(task == 2) {
	Food();
}else if(task == 1) {
	cleanUpPoop();
}else if(task == 0) {
	hitYourPet();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel == 25){
JOptionPane.showMessageDialog(null, "You love this pet!");
}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cleanUpPoop() {
		JOptionPane.showMessageDialog(null, userPet + " might go near you when you clean up its poop.");
		happinessLevel +=3;
	}static void Food() {
		JOptionPane.showMessageDialog(null, userPet + " might go with you when you give it food.");
		happinessLevel +=5;
	}static void Water() {
		JOptionPane.showMessageDialog(null, userPet + " might do nothing when you give it water.");
		happinessLevel +=1;
	}static void takeAWalk() {
		JOptionPane.showMessageDialog(null, userPet + " might like you when you take a walk with it.");
		happinessLevel +=4;
	}static void hitYourPet() {
		JOptionPane.showMessageDialog(null, userPet + " might hat you if you hit it.");
		happinessLevel -=5;
	}
}
