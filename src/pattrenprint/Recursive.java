package pattrenprint;
public class Recursive {
	static int i=1;
	static void row(int n) {
		if(i<=n) {
			i++;
			col(n);
			System.out.println();
			row(n);
		}
	}
	static int j=1;
	static void col(int n) {
		if(j<=n) {
			System.out.print("* ");
			j++;
			col(n);
		}
	}
	public static void main(String[] args) {
		row(5);
	}
}
