/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import edu.fcps.Digit;

public class Lab11 {
	 
	 public static void main(String[] args) {
    
    Display.openWorld("maps/.map");
   Display.setSize(50, 40);
   Display.setSpeed(10);
   
   Digit Zero = new Zero (1,15);
   Digit One = new One (4,15);
   Digit Five = new Five (11,15);
   Digit Two = new Two (18,15);
   Digit Two2 = new Two (25,15);
   Digit Eight = new Eight (32,15);
   Digit Seven = new Seven (38,15);
   Digit Five2 = new Five (45, 15);
   
   Zero.display();
   One.display();
   Five.display();
   Two.display();
   Two2.display();
   Eight.display();
   Seven.display();
   Five2.display();
	
	 }
	 
 }
