package basicprogram;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		int a=0,b=1,c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of series: ");
		d=sc.nextInt();
		System.out.print("Your series is: " +a+ " " +b);
		for(int i=3;i<=d;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		
		
		
	}


}
