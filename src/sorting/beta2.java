package sorting;

public class beta2 
{
void isort(int[]a,int n)
{
	int j;
	for(int i=1;i<=n-1;i++)
	{
		int item=a[i];
		
		for(j=i-1;j>=0 && a[j]>item;j-- )
		{
			a[j+1]=a[j];
		}
		
		a[j+1]=item;
	}
}
}
