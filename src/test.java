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
	 callCommandsFunction("COJHJLD 8, 6, 3, 4, 2, 5, 1, 7");//invalid Temperature
	 
	 callCommandsFunction("COLD 8, 6, 3, 4, 2, 5, 1, 7");
	 
	 callCommandsFunction("COLD 8,");//invalid commands
	 
	 callCommandsFunction("HOT 8, 6, 4, 2, 1, 7");
	 
	 callCommandsFunction("HOT 8, 4, 6, 2, 1, 7");
	 
	 callCommandsFunction("HOT --=");//invalid command sequence

	 
	
 }
}
