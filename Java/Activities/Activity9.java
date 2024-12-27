package activities;

	import java.util.ArrayList;
	import java.util.List;

	public class Activity9 {
	    public static void main(String[] args) {
	    	
	    	// create an Arraylist 
	        
	    	List<String> myList = new ArrayList<>();
	    	
	        //Add 5 names to the list
	        myList.add("Apple");
	        myList.add("Mango");
	        myList.add("Watermelon");
	        myList.add(1, "Papaya");
	        myList.add(3, "Orange");
	        
	        //Print all elements using a loop
	        
	        System.out.println("Print All the Objects:");
	        
	        for(String name : myList){
	            System.out.println(name);
	        }
	        
	        //Print the 3rd element 
	        System.out.println("The third element in the list is: " + myList.get(2));
	        //Search for specific name
	        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
	        
	        //print the size of the list
	        System.out.println("Number of elements in the list before remove " + myList.size());
	        
	        //Remove a element
	        myList.remove(1);
	        myList.remove("Orange");
	        
	        //print the size of the list after Remove
	        System.out.println("Number of elements in the list after remove " + myList.size());
	    }
	}

