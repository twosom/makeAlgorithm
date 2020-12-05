package loopexample;

public class exam4
{
	public static void main(String[] args)
	{
		for(int i = 1; i<=4; i++)
		{
			for(int j =1 ; j<=(i-4)*-1 ;j++)
			{
				System.out.printf(" ");
			}
			System.out.printf("*"); 
			if(i>=2) 
			{
				for(int j =1; j <= i*2-2; j++)
				{
					System.out.printf("*");
				}
				
			}
			System.out.println();
		}
	}
}
