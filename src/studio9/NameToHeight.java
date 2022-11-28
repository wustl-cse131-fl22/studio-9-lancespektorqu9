package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// FIXME
		Map<String, Double> heightMap = new HashMap<>();
		heightMap.put("Aaron", 175.00);
		heightMap.put("Kristin", 166.00);
		heightMap.put("Lleyton", 179.07);
		
		String name = "";
		while(!name.equals("quit")) {
			System.out.println("Enter group member name: ");
			name = in.next();
			if(name.equals("quit")) {
				System.out.println("Quit Program.");
				break;
			}
			else if(heightMap.get(name) == null) {
				System.out.println("Name of member not in map!");
			}
			else {
				System.out.println("Height: "+ heightMap.get(name));
			}
		}

	}
}
