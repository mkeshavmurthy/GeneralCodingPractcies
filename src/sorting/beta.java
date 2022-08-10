package sorting;

public class beta 
{
void bsort(int[]a,int n)
{
	for (int i=0;i<=n-2;i++)
	{
		for (int j=0;j<=n-i-2;j++)
		{
			if (a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
