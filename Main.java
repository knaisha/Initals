import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,1,North,10);
		
    // examples of commands you can invoke on a Robot
    r.putBeeper();
    r.move();// move one step in the direction it is facing
    r.putBeeper();
    r.move();
  	r.putBeeper();
    r.move();
  	r.putBeeper();
    r.move();
	  r.putBeeper();
    Robot g = new Robot(6,1,East,10);



  }
}