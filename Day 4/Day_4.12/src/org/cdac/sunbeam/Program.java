package org.cdac.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void main( String[] args )
	{
		int[] arr1 = new int[ ] { 10, 20, 30, 40, 50 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		for( int element : arr2 )
		{
			System.out.println(element);
		}
	}
	public static void main7( String[] args )
	{
		int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		for( int element : arr )
		{
			System.out.println(element);
		}
	}
	public static void main6( String[] args )
	{
		int[] arr = new int[ ] { 50,10,20,40,30};
		int element = arr[ arr.length ];	//ArrayIndexOutOfBoundsException
		//int element = arr[ -1 ];	//ArrayIndexOutOfBoundsException
		System.out.println(element);
	}
	public static void main5(String[] args) 
	{
		int[] arr = new int[ ] { 50,10,20,40,30};
		System.out.println(Arrays.toString( arr ));		//[50, 10, 20, 40, 30]
		Arrays.sort( arr );	// Dual-Pivot Quicksort
		System.out.println(Arrays.toString( arr ));		//[10, 20, 30, 40, 50]
	}
	public static void main4(String[] args) 
	{
		int[] arr  = new int[  ] { 10, 20, 30 };	//OK
		//System.out.println(arr.toString());	//[I@42a57993
		System.out.println(Arrays.toString( arr ));	//[10, 20, 30]
	}
	public static void main3(String[] args) 
	{
		//int[] arr  = new int[  ] { 10, 20, 30 };	//OK
		int[] arr  = { 10, 20, 30 };	
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);
	}
	public static void main2(String[] args) 
	{
		int[] arr  = new int[ 3 ];	//OK
		for( int index = 0; index < 3; ++ index )
		{
			System.out.print("Enter element	:	");
			arr[ index ] = sc.nextInt();
		}
			
		for( int index = 0; index < 3; ++ index )
			System.out.println(arr[ index ]);
	}
	public static void main1(String[] args) 
	{
		//int arr[]  = new int[ 3 ];	//OK
		int[] arr  = new int[ 3 ];	//OK
		arr[ 0 ] = 10;
		arr[ 1 ] = 20;
		arr[ 2 ] = 30;
		
		for( int index = 0; index < 3; ++ index )
			System.out.println(arr[ index ]);
	}
}
