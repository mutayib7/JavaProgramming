import java.util.Scanner;

public class sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2 arrays");
		int s1,s2;
		s1=sc.nextInt();
		s2=sc.nextInt();
		int[] a1=new int[s1];
		int[] a2= new int[s2];
				
		System.out.println("Enter elements of the first array");
		for(int i = 0; i < s1; i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter elements of the second array");
		for(int i = 0; i < s2; i++)
		{
			a2[i] = sc.nextInt();
		}
		int[]res=new int[s1+s2];
		for(int i = 0; i < s1; i++)
		{
			res[i] = a1[i];
		}
		for(int i =0; i < s2;i++ )
		{
			res[i +s1] = a2[i];
		}
		for(int i = 0; i < s1+s2; i++)
		{
			int k = i;
			for(int j = i+1; j < s1+ s2; j++)
			{
				if(res[j] < res[k])
				{
					k = j;
				}
			}
			int temp = res[i];
			res[i] = res[k];
			res[k] = temp;
		}
		System.out.println("Sorted array is: ");
		for(int i = 0; i < s1+ s2; i++)
		{
			System.out.print(res[i]+ "  ");
		}
		
	}
}
