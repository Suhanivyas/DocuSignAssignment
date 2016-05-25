import java.util.ArrayList;
import java.util.HashMap;
/**
 * class Temperature --- abstract class with 3 abstract methods. Parent class for Hot and Cold classes. 
 * @author    Suhani Vyas 
 */
public abstract class Temperature {
	public abstract void createTemperatureHashMap();
	public abstract boolean checkPantBeforeShoes(HashMap<Integer,Boolean> commandMap);
	public abstract void checkValidCommand(ArrayList<Integer> commandList);
	
}
