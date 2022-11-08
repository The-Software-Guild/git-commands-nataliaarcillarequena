package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TenNumbersMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//hashMap
		Set<Numbers> numbCollection = new HashSet<Numbers>();
		
		//TESTS-----------------------------------------------------
		
		//Numbers numb1 = new Numbers(1, 10);
		//Numbers numb2 = new Numbers(2, 10);
		
		//System.out.println(numb1 + ",     " + numb2);
		
		//if(numb1.equals(numb2)) {
		//	System.out.println("same thing");
		//} else {
		//	System.out.println("not same thing");
		//}
		
		//System.out.println("numb1 hashcode: " + numb1.hashCode());
		//System.out.println("numb2 hashcode: " + numb2.hashCode());
		
		//numbCollection.add(numb1);
		//numbCollection.add(numb2);
		
		//here only prints unique object (as equal must be used 
		//when setting up the hash set 
		//System.out.println(numbCollection);
		//----------------------------------------------------------
		
		//user prompts
		System.out.println("entering 10 numbers");
		
		for(int i=0; i<10; i++) {
			System.out.println("Please enter " + (i+1) + " number : ");
			numbCollection.add(new Numbers(i, sc.nextInt()));		
		}
		
		//now displaying the hashSet via iterator 
		Iterator<Numbers> iterator = numbCollection.iterator();
		
		//no duplicates displayed 
		System.out.println("collection of numbers with no duplicates:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		int numbSize = numbCollection.size();
		
		//CAN USE getNumber() TO CHECK IF the number is in the hashList 
		//GETNUMB IS FROM LOMBOK
		//can get to 10 elements by using size()
		System.out.println("There are " + numbSize +
				" numbers in the collection, add " + (10-numbSize) + 
				" more unique numbers:");
		
		int i=10;
		while(numbCollection.size() < 10) {
			numbSize = numbCollection.size();
			System.out.println("Please enter " + (numbSize+1) +
					" number: "); 
			numbCollection.add(new Numbers(i+1, sc.nextInt()));
			i++;
		}
		
		System.out.println("The collection of 10 numbers: ");
		//displaying all 10 numbers
		for(Numbers numbs:numbCollection) {
			System.out.println(numbs);
		}
	}
	
}
