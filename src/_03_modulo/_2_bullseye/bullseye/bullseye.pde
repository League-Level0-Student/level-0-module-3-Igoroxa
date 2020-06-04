
void setup() {

  // set the size of your sketch
  size ( 1000, 600);
}
void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  fill(255, 0, 0);
  

  //Use an if statement and modulo to alternate the color of your rings.
  for (int i = 10; i > 0; i--) {


    if (i % 2 == 0) {
      fill(255, 0, 0);
    } else {
      fill(255, 255, 255);
    }
    ellipse (500, 325, i*10, i*10);
  }
} 
