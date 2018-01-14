void setup(){
size(1000,1000);

}
//screen _width and screen_height need to be changed according to size of window. 
//Make sure that the pyramid has enough space to be fullly formed. 
int screen_width = 1000; 
int screen_height = 1000;
int bricks_in_base = 14;
int bricks_width = 30;
int bricks_height = 12;
int startpos = (screen_width - (bricks_width * bricks_in_base))/2;
int x = startpos;
int y = screen_height - bricks_height;
int bricks_in_level = bricks_in_base;
int level = 0;
void draw(){
  fill(255,255,255);

for (int i = 0; i < bricks_in_level; i = i+1) {
rect(x,y,bricks_width,bricks_height);
  x = x+ bricks_width;

}
level = level + 1;
x = startpos;
 x = x + (level *((bricks_width)/2));
 bricks_in_level = bricks_in_level -1;
 y = y - bricks_height;
 if(bricks_in_level < 0){
delay(10000);
   exit();
 }
}