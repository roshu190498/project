package org.cdac.sunbeam;

import java.util.Scanner;

public class ComplexTest
{
	static Scanner sc = new Scanner(System.in);
	private Complex complex = new Complex();
	public void acceptRecord(  )
	{
		System.out.print("Enter real number	:	");
		 this.complex.setReal( sc.nextInt());
		System.out.print("Enter imag number	:	");
		this.complex.setImag(sc.nextInt());
	}
	public void printRecord( )
	{
		System.out.println("Real Number	:	"+this.complex.getReal());
		System.out.println("Imag Number	:	"+this.complex.getImag());
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}