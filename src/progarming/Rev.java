package progarming;

public class Rev {
	public static void main(String[] args) {
		String str="hello hi bye";
		String arr[]=str.split(" " );
		System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[0]);
		for(int i=0;i<arr.length;i++) {
			String st="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				st+=arr[i].charAt(j);
			}
			arr[i]=st;
		}
		System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[0]);
	}
}
