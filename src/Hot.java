import java.util.ArrayList;
import java.util.HashMap;

/**
 * class Hot --- extends abstract class Temperature .
 * @author    Suhani Vyas 
 */
public class Hot extends Temperature {
 private HashMap < Integer, String > temperatureMap = new HashMap < Integer, String > ();
 
 /**
  * Hot() --- constructor for class Hot. Calls createTemperatureHashMap() function.
  */
 public Hot() {
  createTemperatureHashMap();
 }
 
 /**
  * createTemperatureHashMap --- method to create temperature specific HashMap.
  */
 public void createTemperatureHashMap() {
  temperatureMap.put(1, "sandals");
  temperatureMap.put(2, "sun visor");
  temperatureMap.put(4, "t-shirt");
  temperatureMap.put(6, "shorts");
  temperatureMap.put(7, "leaving house");
  temperatureMap.put(8, "Removing PJs");
 }
 
 /**
  * checkPantBeforeShoes --- method to check following rule: 
  * For hot temperature: pants -> sandals 
  */
 public boolean checkPantBeforeShoes(HashMap < Integer, Boolean > commmandMap) {
  if (!commmandMap.containsKey(6)){ // check for pants
   return false;
   }
  return true;
 }
 
 /**
  * checkValidCommand --- method to check if list of input commands are valid or invalid.
  *  Print output accordingly .
  */
 public void checkValidCommand(ArrayList < Integer > commandList) {
  HashMap < Integer, Boolean > commmandMap = new HashMap < Integer, Boolean > ();
  Boolean incorrectCommand = false;
  
  commmandMap.put(8, true);
  System.out.print("Removing PJs, ");
  
  for (int i = 1; i < commandList.size(); i++) {
   Integer command = commandList.get(i);
   if (commmandMap.containsKey(command)||!temperatureMap.containsKey(command)) { // to check only 1 piece of each type is worn and command number is valid
    System.out.println("fail");
    return;
   }
   
   switch (command) {
    case 1:
     if (!checkPantBeforeShoes(commmandMap)){
      incorrectCommand = true;
     }
     break;
    case 2:
     if (!commmandMap.containsKey(4)){ // to check the shirt is on before headwear
      incorrectCommand = true;
     }
     break;
    case 3://to check no socks in HOT
     incorrectCommand = true;
     break;
    case 5://to check no jacket in HOT
     incorrectCommand = true;
     break;
    case 7:
     if (commmandMap.keySet().size() != temperatureMap.size() - 1){ // to check all items of clothing have to be worn before leaving the house
      incorrectCommand = true;
     }
     break;
   }
   
   if (incorrectCommand){
    break;
   }
   
   commmandMap.put(command, true);
   
   if (!command.equals(7)){
    System.out.print(temperatureMap.get(command) + ", "); 
   }
   else{ // to check sure last command does not end with a comma
    System.out.println(temperatureMap.get(command));
   }
  }
   if (!temperatureMap.keySet().equals(commmandMap.keySet())) { //to check all items of clothing are put on
    System.out.println("fail");
   }
 }
}
