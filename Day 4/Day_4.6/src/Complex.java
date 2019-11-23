package p1.p2;
public class Complex
{
    private int real;
    private int imag;
    public Complex( )
    {
        this(0,0);
    }
    public Complex( int real, int imag )
    {
        this.real = real;
        this.imag = imag;
    }
    public String toString() 
    {
        return  this.real+" "+this.imag;
    }
}