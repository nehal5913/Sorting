public class Bubble {

	public Bubble() {
		// TODO Auto-generated constructor stub
	}
	public static int[] sort(int[] arr)
	{
		int len=arr.length;
		int temp=0;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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
		int[] arr= {2,8,7,4,3,9};
		int[] arr1=sort(arr);
		print(arr1);
	}
}
