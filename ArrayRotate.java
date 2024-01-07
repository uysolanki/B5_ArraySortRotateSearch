package assg1;

public class ArrayRotate {

	public void rotate(int[] arr, int midElement) {
		for(int i=0;i<midElement;i++)
		{
			int temp=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}	
	}

}
