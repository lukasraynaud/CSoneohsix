import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class List {

	public List() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		ArrayList<String> alpha = new ArrayList<String>();
		alpha.add("Test");
		alpha.add("Test 2");
		alpha.remove("Test");
		alpha.add("Test 3");
		alpha.add("Test 4");

		for (String s : alpha){
			System.out.println(s);
		}
		Iterator<String> i = alpha.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());



		}
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("The");
		myList.add("Quick");
		myList.add("Brown");
		myList.add("Fox");
		myList.remove("Brown");

		Iterator<String> y = myList.iterator();
		while(y.hasNext()){
			System.out.println(y.next());

		}

		for (String z : myList){
			System.out.println(z);
		}

		TreeSet<String> mySet = new TreeSet<String>();
		mySet.add("Yo");
		mySet.add("Dawg");
		mySet.add("I");
		mySet.add("Heard");
		mySet.add("You");
		mySet.add("Like");
		mySet.add("TreeSets");
		mySet.add("Dawg");
		mySet.add("Yo");
		mySet.add("TreeSets");

		for (String s : mySet){
			System.out.println(s);

		}

		Iterator<String> j = mySet.iterator();
		while(y.hasNext()){
			System.out.println(j.next());



		}
	}
}
