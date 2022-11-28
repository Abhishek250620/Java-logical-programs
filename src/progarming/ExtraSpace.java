package progarming;

public class ExtraSpace {
	public static void main(String[] args) {
    String str=" hello   hi     bye  ";
    char[] arr=str.toCharArray();
    for(int i=0;i<arr.length-1;i++) {
    	if(arr[i]==' '&&arr[i+1]==' ') {
    		arr[i]='\0';
    	}
    }
    str=new String(arr);
    System.out.println(str);
	}
}
