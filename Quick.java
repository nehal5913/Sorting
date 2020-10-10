
public class Quick {

	public Quick() {
		// TODO Auto-generated constructor stub
	}
	public static int[] sort(int []arr)
	{
		int n=arr.length;
		for(int gap=n/2;gap>0;gap=gap/2)
		{
			for(int i=gap;i<n;i++)
			{
				int temp=arr[i];
				int j;
				for(j=i;j>=gap&&arr[j-gap]>temp;j=j-gap)
				{
					arr[j]=arr[j-gap];
				}
				arr[j]=temp;
			}
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
