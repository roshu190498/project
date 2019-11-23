package org.cdac.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[ 3 ][ ];
		arr[ 0 ] = new int[  ] { 1, 2, 3 };
		arr[ 1 ] = new int[  ] {4, 5, 6, 7};
		arr[ 2 ] = new int[  ] {8, 9 };
		for( int[] i : arr )
		{
			for( int j : i )
				System.out.print(j+"	");
			System.out.println();
		}
	}
	public static void main3(String[] args) 
	{
		int[][] arr = new int[ 3 ][ ];
		arr[ 0 ] = new int[  ] { 1, 2, 3 };
		arr[ 1 ] = new int[  ] {4, 5, 6, 7};
		arr[ 2 ] = new int[  ] {8, 9 };
		for( int row = 0; row < 3; ++ row )
		{
			System.out.println( Arrays.toString(arr[ row ] ) );
		}
	}
	public static void main2(String[] args) 
	{
		
		int[][] arr = new int[ 3 ][ ];
		arr[ 0 ] = new int[  ] { 1, 2, 3 };
		arr[ 1 ] = new int[  ] {4, 5, 6, 7};
		arr[ 2 ] = new int[  ] {8, 9 };
			
		for( int row = 0; row < arr.length; ++ row )
		{
			for( int col = 0; col < arr[ row ].length; ++ col )
			{
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
	public static void main1(String[] args) 
	{
		int[][] arr = new int[ 3 ][ ];
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 4 ];
		arr[ 2 ] = new int[ 2 ];
		
		for( int row = 0; row < arr.length; ++ row )
		{
			for( int col = 0; col < arr[ row ].length; ++ col )
			{
				System.out.print("Enter element	:	");
				arr[ row ][ col ] = sc.nextInt();
			}
		}
		for( int row = 0; row < arr.length; ++ row )
		{
			for( int col = 0; col < arr[ row ].length; ++ col )
			{
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
}
