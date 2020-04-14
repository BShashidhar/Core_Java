package numbers;
public class elementsOccarence
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,2,4,2,5};
		int tar[]=new int[arr.length];//temp array with same length
		int i,j,k,len=0,flag=1;
		//counting equal 
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag++;
				}
			}
			//avoid repeting elements
			int temp=0;			
			for(k=0;k<len;k++)
			{
				if(tar[k]==arr[i])
					temp++;
			}
			if(temp==0)
			{
				System.out.println(arr[i]+" is "+flag+" times");
				tar[len++]=arr[i];
			}
			flag=1;
		
		}
		
		
	}
}