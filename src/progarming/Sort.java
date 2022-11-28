package progarming;

public class Sort {
	public static void main(String[] args) {
		int temp=0;
		int[] a= {37,33,32,34,35};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]+1!=a[i+1]){
				System.out.println(a[i]+1);
			}
		}
	}
}