package arrayExercise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayExercise {
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("Enter 5 numbers, separated with enters");
List<Integer>numbers=new ArrayList<>();

	for(int i=0; i<5; ++i) {
		String value = input.nextLine();
		int number = Integer.parseInt(value);
		numbers.add(number);
		}
			
		int sum=0;
		int product=1;
			for(Integer number:numbers){
				sum += number;
				product = number;
			}
			int max = Collections.max(numbers);
			int min = Collections.min(numbers);
			
			System.out.println("Sum:" + sum);
			System.out.println("Product:" + product);
			
			
			System.out.println("Largest:" + max);
			System.out.println("Smalles:" + min);
			
			}
		
}
