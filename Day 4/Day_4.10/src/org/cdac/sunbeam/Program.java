package org.cdac.sunbeam;

import java.util.Scanner;

class Complex
{
	private int real;
	private int imag;
	public Complex() 
	{
		this(0,0);
	}
	public Complex(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
	}
	public int getReal()
	{
		return real;
	}
	public void setReal(int real)
	{
		this.real = real;
	}
	public int getImag() 
	{
		return imag;
	}
	public void setImag(int imag)
	{
		this.imag = imag;
	}
	@Override
	public String toString()
	{
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
}
class ComplexTest
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
public class Program 
{
	public static void main(String[] args)
	{
		int choice;
		ComplexTest test = new ComplexTest();
		while ( ( choice = ComplexTest.menuList() ) != 0 )
		{
			switch( choice )
			{
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.printRecord();
				break;
			}
		}
	}
	
}
