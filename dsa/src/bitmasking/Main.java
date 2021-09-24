package bitmasking;

public class Main {
	public static void main(String[] args) {
		swap(10,5);
		isEven(5);
		isEven(10);
		
	}
	public static void swap(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	public static void isEven(int a) {
		if((a&1)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
