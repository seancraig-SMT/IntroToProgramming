package IntroToProgramming;
import java.util.*;

/****

<b>Title:</b> CollectionsExercise.java<br>
<b>Project:</b> lib<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Sean Craig
@version 1.0
@since Jan 22 2023
@updates:

****/

public class CollectionsExercise {

	public static void main(String[] args) {
				
//		createMap();
		createListOfPeople();
		
//		String[] names = { "Sean", "Shelby", "Harvey", "Fenris" };
//		stringToList(names);
	}
	
	
	public static void createMap() {
		
		TreeMap<Integer, String> states_map
			= new TreeMap<Integer, String>();
	
		states_map.put(1, "Alabama");
		states_map.put(2, "Alaska");
		states_map.put(10, "Illinois");
		states_map.put(3, "Arizona");
		states_map.put(4, "Arkansas");
		states_map.put(5, "California");
		
		
		System.out.println(states_map);
		System.out.println(states_map.descendingMap());
	}
		

	public static void createListOfPeople() {
		
		Person john = new Person(1, "John", "Craig");
		Person sean = new Person(2, "Sean", "Craig");
		Person shelby = new Person(3, "Shelby", "Arnold");
		Person jake = new Person(4, "Jake", "Johnson");
		Person ben = new Person(5, "Ben", "Dunn");
		
		LinkedList<Person> people = new LinkedList<>();
		
		people.add(john);
		people.add(sean);
		people.add(shelby);
		people.add(jake);
		people.add(ben);
		
		Collections.shuffle(people);
		
		
		System.out.println(people);
	}
	
	public static void stringToList(String[] names) {
		
		System.out.println(names);
		
		//initialize list
		ArrayList<String> nameList = new ArrayList<>();
		
		for (String name : names) {
			
			//for each name add name to list
			nameList.add(name);
		}
		
		//print out nameList
		
		System.out.print(nameList);
	}
	
}

	