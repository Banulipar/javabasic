package sgicasseigement1;

import java.util.Scanner;

public class ques8 {
	String s;
	public void sca() {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is the commend keyword to exit a loop in java?");
	System.out.println("a: int");
	System.out.println("b: continue");
	System.out.println("c: break");
	System.out.println("d: exit");
	String result =sc.nextLine();
	
	switch(result) {
	case "a":
			System.out.println("incorrect");	
			System.out.println("again? press y to continue");
			 s=sc.nextLine();
			switch(s) {
			case "y":
				ques8 ob =new ques8();
				ob.sca();
				break;
			}
		break;
	case "b":
			System.out.println("incorrect");
			System.out.println("again? press y to continue");
			 s=sc.nextLine();
			 switch(s) {
				case "y":
					ques8 ob =new ques8();
					ob.sca();
					break;
				}
		break;
	case "c":
			System.out.println("correct");
		break;
	case "d":
			System.out.println("incorrect");
			System.out.println("again? press y to continue");
			 s=sc.nextLine();
			 switch(s) {
				case "y":
					ques8 ob =new ques8();
					ob.sca();
					break;
				}
		break;
	default:
		System.out.println("exit");
	}
	
	}
	public static void main(String[] args) {
		ques8 ob =new ques8();
		ob.sca();
	}
}
