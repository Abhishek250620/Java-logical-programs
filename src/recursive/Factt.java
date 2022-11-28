package recursive;

public class Factt {
	static int sum=1;
	static public int factorial(int n) {
		if(n>0) {
			sum*=n;
			factorial(n-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));  
	}
}