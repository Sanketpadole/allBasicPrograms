package Java_Programs;

public class pattern2 {
	
//	public static void printStars(int n) {
//
//		int i, j;
//
//		for (i = 0; i < n; i++) {  
//
//		for (j = 2 * (n - i); j >= 0; j--) { //For Loop for Row
//
//		System.out.print(" "); // Print Spaces
//
//		}
//
//		for (j = 0; j <= i; j++) { //For Loop for col
//
//		System.out.print("* "); // Print Star
//
//		}
//
//		System.out.println();
//
//		}
//
//		}
//
//		public static void main(String args[]) {
//
//		int n = 5; //Number of Rows
//
//		printStars(n);
//
//		}
	
	
	
	
	
	    
		public static void main(String args[])   
		{    
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
		 

		}





