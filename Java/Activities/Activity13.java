package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Activity13 {

    public static void main(String[] args) {
    	
    	//create the objects
        Scanner scan = new Scanner(System.in);
        List<Integer> numArr = new ArrayList<>();
        Random indexGen = new Random();
        
        //statements to show users to indicate when they can type 
        System.out.print("Enter numbers for the list ");
        System.out.println("(Enter a EOL or any non-integer character to stop): ");

        //Loop to take only integers from console
        while(scan.hasNextInt()) {
        	numArr.add(scan.nextInt());
        }

        //generate a random index
        Integer nums[] = numArr.toArray(new Integer[0]);
        int generatedIndex = indexGen.nextInt(numArr.size());
        
        //print the random index and value at that index
        System.out.println("Randon Index generated: " + generatedIndex);
        System.out.println("Number at generated index: " + numArr.get(generatedIndex));

       
    }
}