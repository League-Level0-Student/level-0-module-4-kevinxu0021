void setup(){
PImage face = loadImage("Googly Eyes.jpg");
size(1920,1080);
face.resize(width,height);
background(face);




}
void draw(){
  ellipse(937, 589, 50, 50);
  ellipse(1194, 590, 50,50);
  if(mousePressed){
   println(mouseX + " " + mouseY); 
  }
  
  
  
  
  
}