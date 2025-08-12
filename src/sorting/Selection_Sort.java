package sorting;

public class Selection_Sort {
	public static void selectionSort(int[] arr) {
		int minIndex;
		for(int i=0;i<arr.length-1;i++) {
			minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	static void print(int[] arr,int size) {
		int i;
		for(i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {15,24,7,20,31,25,19};
		int n=arr.length;
		selectionSort(arr);
		System.out.println("Sorted Array:");
		print(arr,n);
	}

}
