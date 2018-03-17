import javax.swing.*;
PImage minecraft;
float X = random(width);
float Y = random(height);
PImage creeper;
void setup(){
size(1920, 1080); //in setup method
minecraft = loadImage("Hide The Creeper Image.jpg");     //in setup method
minecraft.resize(1920, 1080);     //in setup method
background(minecraft);     //in setup method

creeper = loadImage("Creeper.png");
creeper.resize(5,5);
}
void draw(){
  image(creeper, X, Y);
  if(mousePressed){
   fill(255,0,0);
   ellipse(mouseX, mouseY, 10,10);
  }
  if(isNear(mouseX, 1910)&&(isNear(mouseY, 0))){
   fill(0,255, 0);
   ellipse(mouseX, mouseY, 10,10);
  }
  print(mouseX + "," + mouseY + ".");
  if(isNear(mouseX, X) && (isNear(mouseY, Y))){
    JOptionPane.showMessageDialog(null, "You found the creeper!");
  background(minecraft); 
  
   X = random(width);
   Y = random(height);
  }
  
}

boolean isNear(int a, float b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}