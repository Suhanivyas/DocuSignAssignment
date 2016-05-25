import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class Commands --- Used to store the input command in following format.
 * Example:
 * "HOT 8, 6, 4, 2, 1, 7"
 * inputTemperature= new Hot() (object of type Hot)
 * commandList=[ 8, 6, 4, 2, 1, 7] (arraylist of integer storing command)
 * 
 * @author    Suhani Vyas 
 */
public class Commands {
 Temperature inputTemperature;
 ArrayList < Integer > commandList = new ArrayList <Integer> ();
 
 /**
  * storeInputCommand --- method that parses the input string and stores the values in member variables inputTemperature and commandList.
  * return boolean value to indicate is input temperature is valid or not
  */
 public boolean storeInputCommand(String input) {	 
  Pattern pattern = Pattern.compile("([a-zA-Z]*)((\\s*\\d*,?)*)"); // regular expression pattern to match input string
  Matcher m = pattern.matcher(input);
  
  if (m.find()) { // if there's a match
   if (m.group(1).equals("HOT")) { // input is hot 
    inputTemperature = new Hot();
   } 
   else if (m.group(1).equals("COLD")) {//input is cold
    inputTemperature = new Cold();
   } 
   else {// input is anything other than hot or cold
    System.out.println("fail");
    return false;
   }
   
   String newStr = m.group(2).replace(" ", ""); // remove whitespace from commands
   if(newStr.length()==0){
	   System.out.println("fail");
   		return false;
   }
   for (String s: newStr.split(",")) { // split commands on ','
    this.commandList.add(Integer.valueOf(s));
   }
  }
  return true;
 }
 
 /**
  * checkInputCommand --- method to check if first command is Take off pajamas.
  * Calls checkValidCommand function to print rest of the commands.
  */
 public void checkInputCommand() {
  if (commandList.get(0) == 8) // remove pajamas first
   inputTemperature.checkValidCommand(commandList);
  else {
   System.out.println("fail");
  }
 }
}
