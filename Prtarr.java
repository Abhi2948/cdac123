/*import java.util.Scanner;
	class Prtarr{
	public static void main(String args[]){
	int arr[]=new int[]{1,2,3,4,5};
	System.out.println("element of given array");
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+" ");
			}
		}
	}*/
import java.util.Scanner;
	class Prtarr{
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);//to define object and take input from user
		
		int arr[]=new int[10];//arr.length=10
		System.out.println("elements of given array");
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();//to take input
	}
		System.out.println("array elements are");
		for(int i=0;i<arr.length;i++){
		

	System.out.println(arr[i]);
				}
			}
		}