import java.io.*;
class ar
{
public void areacalc(int length)
{
System.out.println("Area of circle"+(length*length));
}

public void areacalc(int length,int height)
{
System.out.println("Area of rectangle"+(length*height));
}

public void areacalc(int length,float height)
{
System.out.println("Area of triangle"+((1/2)*length*height));
}
}

class area
{
public static void main(String args[])
{
ar s=new ar();
s.areacalc(7);
s.areacalc(6,5);
s.areacalc(7,8.23f);
}
}                                                                                                                                                       


