package sgicasseigement1;

import java.util.Scanner;

public class armstongnum {

	public static void main(String[] args) {
		  int c=0,a,tem;  
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter the num");
		  int x= sc.nextInt();
		    tem=x; 
		    while(x>0)  
		    {  
		    a=x%10;  
		    x=x/10;  
		    c=c+(a*a*a);  
		    }  
		    if(tem==c)  
		    	System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   

	}

}
