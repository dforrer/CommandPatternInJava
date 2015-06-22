package cmd;
  
/** 
 * The Client-class 
 * ================
 * Das Client-Objekt besitzt ein einzelnes Invoker-Objekt 
 * und mehrere Command-Objekte. Das Client-Objekt 
 * entscheidet, wann welche Command-Objekte ausgeführt 
 * werden, dafür übergibt es die Objekte an das 
 * Invoker-Objekt. 
 */
public class PressSwitch {
   public static void main(String[] args){
 
	  // Receiver
      Light lamp = new Light();
      
      // Commands to execute
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);
 
      // Invoker
      Switch mySwitch = new Switch();
 
      // Executing the commands
      mySwitch.storeAndExecute(switchUp);
      mySwitch.storeAndExecute(switchDown);
   }
}