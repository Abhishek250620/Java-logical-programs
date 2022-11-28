package pattrenprint;

public class Traingle {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j>=n+1? "* ":" ");
			}
			System.out.println();
		}
		System.out.println("==================================");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j>=n+1? " *":"  ");
			}
			System.out.println();
		}
		System.out.println("====================================");
		for(int i=1;i<=n;i++) {
			int a=1;
			char b='A';
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					if(i+j>=n+1) {
						System.out.print(b+" ");
						b++;
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(i+j>=n+1) {
						System.out.print(a+" ");
						a++;
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		System.out.println("====================================");
		for(int i=1;i<=n;i++) {
			int a=1;
			char b='A';
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					if(i+j>=n+1) {
						System.out.print(b+" ");
						b++;
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(i+j>=n+1) {
						System.out.print(a+" ");
						a++;
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		System.out.println("==================================");
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j>=n+1? " *":"  ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j>=i? " *":"  ");
			}
			System.out.println();
		}
	}
}







