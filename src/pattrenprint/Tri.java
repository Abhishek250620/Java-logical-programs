package pattrenprint;

public class Tri {
	public static void main(String[] args) {
		int a=15;
		for(int i=a;i>=1;i--) {
			for(int j=a;j>=1;j--) {
				System.out.print(i+j>=a+1?"* ":" ");
			}
			System.out.println();
		}
	}
}
