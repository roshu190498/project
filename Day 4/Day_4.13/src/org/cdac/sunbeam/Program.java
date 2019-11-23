package org.cdac.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[  ][  ] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for( int[] i : arr )
		{
			for( int j : i )
				System.out.print(j+"	");
			System.out.println();
		}
	}
	public static void main3(String[] args) 
	{
		int[][] arr = new int[  ][  ] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for( int row = 0; row < 3; ++ row )
		{
			System.out.println( Arrays.toString(arr[ row ] ) );
		}
	}
	public static void main2(String[] args) 
	{
		
		//int[][] arr = new int[  ][  ] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr =  { {1,2,3,4},{5,6,7,8},{9,10,11,12}};	
		for( int row = 0; row < 3; ++ row )
		{
			for( int col = 0; col < 4; ++ col )
			{
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
	public static void main1(String[] args) 
	{
		//int arr[][] = new int[ 3 ][ 4 ];	//OK
		//int[] arr[] = new int[ 3 ][ 4 ];	//OK
		int[][] arr = new int[ 3 ][ 4 ];	//OK
		
		for( int row = 0; row < 3; ++ row )
		{
			for( int col = 0; col < 4; ++ col )
			{
				System.out.print("Enter element	:	");
				arr[ row ][ col ] = sc.nextInt();
			}
		}
		for( int row = 0; row < 3; ++ row )
		{
			for( int col = 0; col < 4; ++ col )
			{
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
}
