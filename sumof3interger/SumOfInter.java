package sumof3interger;

public class SumOfInter {

	public static void main(String[] args) {
		
		int [] arr = {0, -1, 2, -3, 1};
		int n =arr.length;
		findTriple(arr, n);
	}
	public static void findTriple(int[] arr,int n) {
		
		boolean found = false;
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; j<n; k++) {
					if (arr[i]+arr[j]+arr[k] == 0) {
						System.out.println(arr[i] );
						System.out.println(arr[j]);
						System.out.println(arr[k] );
						found =true;
						
						}
					}
				}
		     
		}
			if (found == false) {
				System.out.println("NO EXIT");
			}
			
			
		}
		
	}
	

