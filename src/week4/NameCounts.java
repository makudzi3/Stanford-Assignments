package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.HashMap;
import acmx.export.java.util.Iterator;
import acmx.export.java.util.Map;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		HashMap nameMap = new HashMap();
		 
		readNames(nameMap);
		 print(nameMap);
		}
		/*
		* Reads a list of names from the user, storing names and how many
		* times each appeared in the map that is passed in as a parameter.
		*/
		private void readNames(Map map) {
		while (true) {
		String name = readLine("Enter name: ");
		if (name.equals("")) break;
		// See if that name previously appeared in the map. Update
		// count if it did, or create a new count if it didn't.
		Integer count = (Integer) map.get(name);
		if (count == null) {
		count = new Integer(1);
		} else {
		count = new Integer(count + 1);
		}
		map.put(name, count);
		}
		}
		/*
		* Prints out list of entries (and associated counts) from the map
		* that is passed in as a parameter.
		*/
		private void printMap(Map map) {
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
		String key = (String) it.next();
		int count = (int) map.get(key);
		println("Entry [" + key + "] has count " + count);
		}
		}
		

	}
	

