package org.cdac.sunbeam;

import java.util.Scanner;
public class Program 
{
	public static void sum( int... arr)
	{
		int result = 0;
		for( int element : arr )
			result = result + element;
		System.out.println("Result	:	"+result);
	}
	public static void main1(String[] args) 
	{
		Program.sum( );
		Program.sum( 10, 20 );
		Program.sum( 10, 20, 30 );
		Program.sum( 10, 20, 30, 40 );
		Program.sum( 10, 20, 30, 40, 50 );
	}
	public static void main(String[] args) 
	{
		System.out.printf("Hello\n");
		int x = 10;
		System.out.printf("X	:	%d\n", x);
	}
}
