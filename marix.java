package sgicasseigement1;

import java.util.Scanner;

public class marix {
		int[][] matx =new int[2][2];
		double determinant;
		
		public void mat() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value A");
		int a= sc.nextInt();
		System.out.println("enter value B");
		int b= sc.nextInt();
		System.out.println("enter value C");
		int c= sc.nextInt();
		System.out.println("enter value D");
		int d= sc.nextInt();
		
	   
		   for(int i=0;i<2;i++) {
			   for(int j=0;j<2;j++) {
				    determinant =a*d-b*c;
			   }
		   }
		   System.out.println(determinant);
	   }
	  
	   public static void main(String args[]) {
		   marix ob =new marix();
		   ob.mat();
	   }

}
