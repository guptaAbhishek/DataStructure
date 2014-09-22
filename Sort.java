package dataStructure;

public class Sort {
	
	private static int indexSmallest(int[] arr,int lower,int upper){
		int indexMin = lower;
		for(int i=lower+1;i<=upper;i++){
			if(arr[i]<arr[indexMin]){
				indexMin = i;
			}
		}
		return indexMin;
	}
	
	private static int partition(int[] arr,int first,int last){
		int pivot = arr[(first+last)]/2;
		int i = first-1;
		int j = last+1;
		while(true)
		{
			do
			{
				i++;
			}while(arr[i]<pivot);
			
			do
			{
				j--;
			}while(arr[j]>pivot);
			
			if(i<j){
				swap(arr,i,j);
			}
			else{
				return j;
			}
		}
	}
	
	private static void qSort(int[] arr,int first,int last){
		int split = partition(arr,first,last);
		if(first<split){
			qSort(arr,first,split);
		}
		if(last>split+1){
			qSort(arr,split+1,last);
		}
	}
	
	//Selection sort
	public static void selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int j = indexSmallest(arr,i,arr.length-1);
			swap(arr,i,j);
		}
	}
	
	//Bubble Sort
	public static void bubbleSort(int[] arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	//Insertion Sort
	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int toInsert = arr[i];
				int j=i;
				do{
					arr[j] = arr[j-1];
					j--;
				}while(j>0 && toInsert<arr[j-1]);
				arr[j] = toInsert;
			}
			
		}
	}
	
	//Quick Sort
	public static void quickSort(int[] arr){
		qSort(arr,0,arr.length-1);
	}
	
	//Swap method
	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]= temp;
	}
}


