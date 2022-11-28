package progarming;
import java.util.Scanner;
public class NearestPrimeNo {
	static boolean primeNo(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c==2?true:false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		sc.close();
		boolean prime=false;
		if(primeNo(no)) {
			System.out.println(no+"-0");
		}
		else {
			int n1=no,n2=no;
			while(prime==false) {
				if(primeNo(n1+=1)) {
					System.out.println(n1+"-"+(n1-no));
					break;
				}
				else if(primeNo(n2-=1)) {
					prime=true;
					System.out.println(n2+"-"+(no-n2));
				}
			}
		}
	}
}
