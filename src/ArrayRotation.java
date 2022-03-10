public class ArrayRotation {
	
	static void rightRotate(int a[], int n, int k) {	
		k=k%n;	
		for(int i = 0; i < n; i++) {
			if(i<k) {	
				System.out.print(a[n + i - k] + " ");
			}
			else {
				System.out.print(a[i - k] + " ");
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
	    int arr[] = {1, 2, 7, 8, 9};
	    int n = arr.length;	 
	    int k = 3;
	    rightRotate(arr, n, k);	 
	}
}
