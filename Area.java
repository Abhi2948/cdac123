/*import java.util.Scanner;
class Arofcircle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		double r=s.nextDouble();
		double a=(3.14*r*r);
		System.out.println("the area is="+a);
	}
}*/
class Area{
	int r=2;
	double pi=3.14;
	int l=3,w=7,b=5,h=6;
	void circle()
	{
		double area=pi*r*r;
		System.out.println("Area of circle="+area);
		
	}
	void square()
	{
		double a_sq=l*l;
		System.out.println("Area of circle="+a_sq);
		
	}
	void triangle()
	{
		double a_tri=((b*h)/2);
		System.out.println("Area of circle="+a_tri);
		
	}
	void rectangle()
	{
		double a_rec=l*w;
		System.out.println("Area of circle="+a_rec);
		
	}
	
	public static void main(String args[])
	{
		Area ar=new Area();
		ar.circle();
		ar.square();
		ar.triangle();
		ar.rectangle();
		
	}
}