package array;

public class CopyElementNewArray {

	public static void main(String[] args) {
		
		int arr[]= {2,4,5,6,8,10};
		int arr1[]= new int[ arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr1[i]=arr[i];
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
