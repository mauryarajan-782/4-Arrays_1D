package Arrays_1D;

import java.util.Scanner;

public class Arrays_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[];
		
		arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter for arr["+ i +"] : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
