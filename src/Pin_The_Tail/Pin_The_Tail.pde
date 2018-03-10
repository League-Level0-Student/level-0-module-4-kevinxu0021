import ddf.minim.*;
AudioSample woohooSound; 
boolean playSound = true;
int tailX = 0;
int tailY = 0;
PImage animal;
PImage tail;
void setup(){
  animal = loadImage("Animal.jpg");
  tail = loadImage("Tail.png");
  animal.resize(1920,1080);
  size(1920, 1080);
   tail.resize(50,50);
   Minim minim = new Minim(this); 
   woohooSound = minim.loadSample("Victory.wav");
   
}
void draw(){
  if(dist(0,0,mouseX,mouseY)<30){
  background (animal);
  }else{
   background (255, 255, 255); 
  }
  if(dist(1120, 850, tailX, tailY)<40){
   image(tail, tailX, tailY);
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
  }
 rect(0, 0, 30, 30);
  if(mousePressed){
  image(tail, mouseX-20, mouseY-20);
  tailX = mouseX-20;
  tailY = mouseY-20;
  image(tail, tailX, tailY);
  }

  
  
}