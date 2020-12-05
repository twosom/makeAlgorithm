package operator;

import java.util.Scanner;

public class getBinaryValue 
{
	
	static int [] binary = {128,64,32,16,8,4,2,1};
	
	static int[] getBin(int n) {
		int [] zeros = {0,0,0,0,0,0,0,0};
		
		for(int i=0; i<binary.length; i++)
		{
			if(binary[i]<=n)
			{
				zeros[i] = 1;
				n=n-binary[i];
			}
		}
		return zeros;
	}
	
	
	
	
	public static void main(String [] args)
	{
		
		//2진수 로 만들기 위한 배열 준비
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("press n : ");
		int n = scan.nextInt();
		int [] zeros;
		
		if(n < 0)
		{
			//n이 음수일 때
			zeros = getBin(-1*n);
			//1의 보수 구하기
			for(int i=0; i<zeros.length; i++)
			{
				if(zeros[i] == 1)
				{
					zeros[i] = 0;
				}
				else if(zeros[i] == 0)
				{
					zeros[i] = 1;
				}
			}
			
			//제일 낮은 자리에 1 더하기
			zeros[zeros.length-1] += 1;
			//자릿수 바꿔주기
			for(int i = zeros.length-1; i > 0; i--)
			{
				if(zeros[i] == 2)
				{
					zeros[i] = 0;
					zeros[i-1] += 1;
				}
			}
		}
		else 
		{
			zeros = getBin(n);
		}
		
		
		
		System.out.printf("0b ");
		for(int temp : zeros)
		{
			System.out.printf("%2d", temp);
		}
		
		scan.close();
	}
}
