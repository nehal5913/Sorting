public class Selection {
	public Selection() {
		// TODO Auto-generated constructor stub
	}
	public static int[] sort(int[] arr)
	{
		int n=arr.length,min=0;
		for(int i=0;i<n-1;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
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
		int[] arr= {2,55,75,12,31,9};
		int[] arr1=sort(arr);
		print(arr1);
	}
}
