package greatLearning.SortMentor;

public class SortExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sort Array-n logn
//		Left Rotate array
//		Search alogorithm to find element-log n
		
		
		
		//1. Sort Array using Merge Sort (nlogn)
		
		int[] arr = {1,2,3,4,5,6,7};
		rotateArray(arr, 4);
			
		
	}
	
	static int[] rotateArray(int[] arr, int num){
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[arr.length-1]=temp;
		}
		rotateArray(arr, num);
		return arr;
	}
	
	

}
