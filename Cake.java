import java.util.Scanner;
class Cake
{
String name;
String flavour;
int price;
int weight;
void display()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the name of cake->");
	String name=sc.nextLine();
	System.out.print("enter the flavour of cake->");
	String flavour=sc.nextLine();
	System.out.print("weight of cake in gms->");
	weight=sc.nextInt();
	System.out.print("the price of cake in rupees->");
	price=sc.nextInt();
	System.out.println("name is= "+name);
	System.out.println("flavour is= "+flavour);
	System.out.println("weight of cake in gms= "+weight);
	System.out.println("price of cake in rupees= "+price);
	
	
}
public static void main(String args[])
{
Cake ck=new Cake();
ck.display();
}
}
