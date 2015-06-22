package cmd;

import java.util.ArrayList;
import java.util.List;

/** 
 * The Invoker class 
 * =================
 * Weiss wie ein Command ausgeführt werden muss. 
 * Optional wird hier auch festgehalten, 
 * wie und wann die Ausführung des Command stattfindet. 
 * Der Invoker weiss nichts über das konkrete Command, 
 * denn er kennt nur das Command-Interface.
 */
public class Switch {
   private List<Command> history = new ArrayList<Command>();
 
   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();
   }
}
