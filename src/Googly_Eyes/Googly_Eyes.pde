int lpX = 937;
int lpY = 589;
int rpX = 1194;
int rpY = 591;
void setup(){
PImage face = loadImage("Googly Eyes.jpg");
size(1920,1080);
face.resize(width,height);
background(face);




}
void draw(){
  fill(255,255,255);
  ellipse(937, 589, 50, 50);
  ellipse(1194, 590, 50,50);
  fill(0,0,0);
  ellipse(lpX,lpY,20,20);
  ellipse(rpX,rpY,20,20);
  if(mouseX < 924){
   lpX = 924; 
  }else if(mouseX > 953){
   lpX = 953; 
  }else{
   lpX = mouseX; 
  }
  if (mouseY < 570){
    lpY = 570;
  }else if (mouseY > 604){
    lpY = 604;
  }else{
   lpY = mouseY; 
  }
  if (mouseX < 1174){
    rpX = 1174;
  }else if (mouseX > 1211){
    rpX = 1211;
  }else{
   rpX = mouseX; 
  }
  if (mouseY < 571){
    rpY = 571;
  }else if (mouseY > 606){
    rpY = 606;
  }else{
   rpY = mouseY; 
  }
  if(mousePressed){
   println(mouseX + " " + mouseY); 
  }
  
  
  
  
  
}