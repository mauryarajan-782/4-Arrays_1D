package Arrays_1D;

import java.util.Scanner;

public class Arrays_3 {

	public static void inputAnarray(int arr[]) {
		
		System.out.println("Taking user input in an array..............");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter for arr["+ i +"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\\n-------------");
	}
	
	public static void printAnArray(int arr[]) {
		
		System.out.println("Printing an array..............");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\\n-------------");
	}
	
	public static void sumOfAnArray(int arr[]) {
		
		System.out.println("Printing Sum of an array..............");
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all integers : " + sum);
		
		System.out.println("---------------");
	}
	
	public static void main(String[]args) {
		
		int actualArr[] = new int[5];
		
		inputAnarray(actualArr);
		
		printAnArray(actualArr);
		
		sumOfAnArray(actualArr);
	}
		
		
}