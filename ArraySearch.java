package assg1;

public class ArraySearch {

	public int search(int[] arr, int right, int searchElement) {
		int pivot=right/2;
		if(searchElement==arr[pivot])
			return pivot;
		else if(searchElement>arr[0])
			return binarySearch(arr,0,pivot-1,searchElement);
		else
			return binarySearch(arr,pivot+1,right,searchElement);
	}

	private int binarySearch(int[] arr, int first, int last, int searchElement) {
	
		if(first>last)
			return -1;
		
		int mid=(first+last)/2;
		if(searchElement==arr[mid])
			return mid;
		else if(searchElement>arr[mid])
			return binarySearch(arr,mid+1,last,searchElement);
		else
			return binarySearch(arr,first,mid-1,searchElement);
			
	}

}
