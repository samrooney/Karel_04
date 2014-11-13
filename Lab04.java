/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

  public static void takeTheField(Athlete arg)
  {
	arg.move();
	arg.move();
	arg.move();
	arg.move();
	arg.turnRight();
	arg.move();
	arg.move();
   }

public static void main(String[] args) {
            
            Display.openWorld("maps/arena.map");
            Display.setSize(10, 10);
            Display.setSpeed(8);
          
               Athlete Jackie = new Athlete();
               Athlete Derek = new Athlete();
               Athlete Pete = new Athlete();
               Athlete Johnny = new Athlete();
               Athlete Bob = new Athlete();
               Athlete Coach = new Athlete(1,7, Display.EAST, 0);
               Athlete JackNavinWeinstein = new Athlete();
               
               takeTheField(Jackie);
               takeTheField(Derek);
               takeTheField(Pete);
               takeTheField(Johnny);
               takeTheField(Bob);
               takeTheField(JackNavinWeinstein);
             
               Jackie.move();
               Jackie.move();
               Jackie.move();
               Jackie.turnLeft();
               Jackie.move();
               Jackie.move();
               Jackie.turnAround();
               
             
               Derek.move();
               Derek.turnLeft();
               Derek.move();
               Derek.turnAround();
               
               Pete.move();
               Pete.move();
               Pete.move();
               Pete.move();
               Pete.move();
               Pete.turnLeft();
               Pete.move();
               Pete.turnAround();
               
               Johnny.move();
               Johnny.move();
               Johnny.turnRight();
               
               Bob.move();
               Bob.move();
               Bob.move();
               Bob.turnRight();
               
               JackNavinWeinstein.move();
               JackNavinWeinstein.move();
               JackNavinWeinstein.move();
               JackNavinWeinstein.move();
               JackNavinWeinstein.turnRight();
               
               
               
             
               
             
          }
          
          
          }
               
      