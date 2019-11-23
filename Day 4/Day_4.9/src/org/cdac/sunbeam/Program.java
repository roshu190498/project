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
public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( Complex c1 )
	{
		System.out.print("Enter real number	:	");
		c1.setReal( sc.nextInt());
		System.out.print("Enter imag number	:	");
		c1.setImag(sc.nextInt());
	}
	public static void printRecord( Complex c1 )
	{
		System.out.println("Real Number	:	"+c1.getReal());
		System.out.println("Imag Number	:	"+c1.getImag());
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		int choice;
		Complex c1 = new Complex();
		while ( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Program.acceptRecord(c1);
				break;
			case 2:
				Program.printRecord(c1);
				break;
			}
		}
	}
	public static void main4(String[] args)
	{
		Complex c1 = new Complex( );
		Program.acceptRecord( c1 );
		Program.printRecord( c1 );
	}
	public static void main3(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Complex c1 = new Complex( );
		System.out.print("Enter real number	:	");
		c1.setReal( sc.nextInt());
		System.out.print("Enter imag number	:	");
		c1.setImag(sc.nextInt());
		
		System.out.println("Real Number	:	"+c1.getReal());
		System.out.println("Imag Number	:	"+c1.getImag());
		
	}
	public static void main2(String[] args)
	{
		Complex c1 = new Complex( );
		c1.setReal(10);
		c1.setImag(20);
		System.out.println("Real Number	:	"+c1.getReal());
		System.out.println("Imag Number	:	"+c1.getImag());
		
	}
	public static void main1(String[] args)
	{
		Complex c1 = new Complex(10, 20);
		System.out.println(c1.toString());
	}
}
