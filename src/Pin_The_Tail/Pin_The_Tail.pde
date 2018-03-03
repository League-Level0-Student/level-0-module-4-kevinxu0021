void setup(){
  size(1920,1080);
  PImage Animal;     //at the top of the sketch
Animal = loadImage("Animal.jpg"); 
//in setup method
Animal.resize(1920,1080);
background(Animal);     //in setup method


}
void draw(){
  if(mousePressed){
PImage Tail;     //at the top of the sketch

Tail = loadImage("Tail.png");     //in setup method
Tail.resize(100,100);
image(Tail, mouseX, mouseY);     //in draw method
}



}