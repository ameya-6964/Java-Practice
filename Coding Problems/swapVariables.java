//This Code Swaps The Value Of Two Variables With Help Of Third Variable
public class swapVariables {

	public static void main(String[] args) {
		// Swapping Two Variable
		int a = 10;
		int b = 15;
		int temp = 0;
		System.out.println("before Swapping a=" + a);
		System.out.println("before Swapping b=" + b);
		temp = a; // temp=10
		a = b; // a=15
		b = temp;// b=10
		System.out.println("After Swapping a=" + a);
		System.out.println("After Swapping b=" + b);
	}
}
