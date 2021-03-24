package sgicasseigement1;

import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enterthe number");
		int val =sc.nextInt();
		
		switch(val) {
		case 0:
				System.out.println("0 pressed");	
			break;
		case 1:
				System.out.println("1 pressed");
			break;
		case 2:
			System.out.println("2 pressed");
		break;
		case 3:
			System.out.println("3 pressed");
		break;
		case 4:
			System.out.println("4 pressed");
		break;
		case 5:
			System.out.println("5 pressed");
		break;
		default:
			System.out.println("not allowed");
		}
	}

	

}
