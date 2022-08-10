package sorting;

public class beta1 
{
void ssort(int[]a,int n)
{
	
	for(int i=0;i<=n-2;i++)
	{
		int min=a[i];
		int k=i;
		
		for(int j=i+1;j<=n-1;j++)
		{
			if (a[j]<min)
			{
				min=a[j];
				k=j;
			}
		}
		
		int temp=a[i];
		a[i]=a[k];
		a[k]=temp;
	}
}
}
