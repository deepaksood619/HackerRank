// http://www.geeksforgeeks.org/bubble-sort/

/*
	Optimized Bubble Sort - Stop the algorithm if inner loop didn’t cause any swap.

	Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

	Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

	Auxiliary Space: O(1)

	Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

	Sorting In Place: Yes

	Stable: Yes
*/

class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Bubble Sort");
		
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int n = arr.length;
		
		boolean swapped = false;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swapped = true;
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			
			if(!swapped) {
				System.out.println("Already Sorted");
				break;
			}			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}