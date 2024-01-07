package assg1;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter size of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0;  i< arr.length; i++) 
			arr[i]=sc.nextInt();
		
		System.out.println("Before Sorting : "+Arrays.toString(arr));
//		MergeSort ms=new MergeSort();
//		ms.sort(arr,0,size-1);
		InsertionSort is=new InsertionSort();
		is.sort(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
		
		int midElement=size/2;
		ArrayRotate ar=new ArrayRotate();
		ar.rotate(arr,midElement);
		System.out.println("After Rotation : "+Arrays.toString(arr));
		
		System.out.println("Please enter number to search");
		int s=sc.nextInt();
		ArraySearch as=new ArraySearch();
		int index=as.search(arr,arr.length-1, s);
		if(index==-1)
			System.out.println("Number not found");
		else
			System.out.println("Found at "+index+ " Index ");
	}

}
