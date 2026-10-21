package Arrays_Varargs;

import java.util.Scanner;

public class Arrays_Varargs {
		
		public static void printAllInteger(int... a) {
			
			System.out.println("Printing an array.......");
			
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
			
			System.out.println();
		}
		
		public static void main(String[]args) {
			
			printAllInteger(1,2,4);
			printAllInteger(1,2,3,4);
			printAllInteger(1,2);
			printAllInteger(1,24,4,5,5,3,4);
			printAllInteger(1, 2, 4, 6, 8, 8, 9, 95, 4);
			printAllInteger(1,2,4);
		}

}
