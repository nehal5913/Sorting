public class Insertion {
	public static int[] sort(int[] arr)
	{
		int n=arr.length;
		int key=0;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			int j=i-1;
			while((j>=0)&&(arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int []arr= {34,98,76,45,23,9};
		int[] arr1=sort(arr);
		print(arr1);
	}
}
