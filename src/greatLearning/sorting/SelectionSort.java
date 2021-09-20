package greatLearning.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {56,433,22,0,8,8};
		int[] sortArr = implementSelectionSort(arr);
		for(int i=0;i<sortArr.length;i++) {
			System.out.print(sortArr[i]+" ");
		}
	}
	
	public static int[] implementSelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index])
					index = j;
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			System.out.println("Elements at Iteation-"+i);
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		return arr;
	}

}
