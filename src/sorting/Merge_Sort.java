package sorting;

public class Merge_Sort {
	public static void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public static void merge(int[] arr,int low,int mid,int high) {
		
	}
	public static void main(String[] args) {
		int[] arr= {15,89,20,25,12,6,24};
		mergeSort(arr,0,arr.length-1);

	}

}
