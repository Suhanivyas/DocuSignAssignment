public class Test {
/**
 * callCommandsFunction --- method to call Commands object's functions to store and process input. 
 * @author    Suhani Vyas 
 */	
 public static void callCommandsFunction(String input) {
  Commands c = new Commands();
  if (c.storeInputCommand(input)) {
   c.checkInputCommand();
  }
 }
 
 public static void main(String[] args) {
	 callCommandsFunction("HOT 8, 6, 3");
 }
}
