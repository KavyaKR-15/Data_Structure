package sorting;

public class Bubble_Sort {
   static void bubblesort(int[] arr,int n) {
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n-1;i++) {
			swapped=false;
			for(j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) break;
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
		bubblesort(arr,n);
		System.out.println("Sorted Array:");
		print(arr,n);
	}

}
