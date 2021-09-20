package greatLearning.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11, 17, 25, 20};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.println("Bubble Sort Ascending from left");
		int[] sortedArr=implementBubbleSortAscendingFromLeft(arr);
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
//		System.out.print("\n");
//		System.out.println("Bubble Sort Descending from left");
//		int[] descLeft=implementBubbleSortDescendingFromLeft(arr);
//		for(int i=0;i<descLeft.length;i++) {
//			System.out.print(descLeft[i]+" ");
//		}
	}
	
	public static int[] implementBubbleSortAscendingFromLeft(int[] arr) {
		int size=arr.length;
		for(int j=0;j<size;j++) {
			for(int i=0;i<size-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			System.out.println("Elements at Iteration-"+j);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			size--;
		}
		
		return arr;
	}
	
	public static int[] implementBubbleSortDescendingFromLeft(int[] arr) {
		int size=arr.length;
		for(int j=0;j<size;j++) {
			for(int i=0;i<size-1;i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
//			System.out.println("Elements at Iteration-"+j);
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
			size--;
		}
		
		return arr;
	}

}
