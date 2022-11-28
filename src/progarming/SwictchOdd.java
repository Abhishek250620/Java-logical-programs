package progarming;

public class SwictchOdd {
	public static void main(String[] args) {
		int a=7;
		switch(a%2) {
		case 0:System.out.println("even");
		break;
		case 1:System.out.println("odd");
		break;
		default:System.out.println("Invalid");
		}
	}
}
