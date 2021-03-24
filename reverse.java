package sgicasseigement1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		String name;  
		Scanner sc=new Scanner(System.in);  
			System.out.print("Enter a String: ");  
			name=sc.nextLine();  
		
		System.out.print("After reverse string is: ");  
			for(int i=name.length();i>0;--i){  
				System.out.print(name.charAt(i-1));           
			}

	}

}
