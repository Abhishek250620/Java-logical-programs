package progarming;
public class CountingNoOfReaptedWords {
	public static void main(String[] args) {
		String str="hello hi bi hello hi welcome";
		String[] arr1=str.split(" ");
		String[] arr2=str.split(" ");
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					count++;
					arr2[j]="";
				}
			}
			if(count>0) {
			System.out.println(arr1[i]+"->"+count);
			}
		}
	}
}
