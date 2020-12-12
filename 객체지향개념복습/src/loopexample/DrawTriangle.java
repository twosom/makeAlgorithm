package loopexample;

public class DrawTriangle 
{
	public static void main(String[] args)
	{
		drawTriangle(6);
	}
	
	
	static void drawTriangle(int lineNumber)
	{
	    //첫 줄 0을 출력
	    for(int i = 0; i < lineNumber; i ++)
	    {
	      System.out.printf(" ");
	    }
	    System.out.println(0);
	    
	    //공백 입력 후 0 출력 끝
	    int space = lineNumber - 1;
	    for(int line = 1; line < (lineNumber-1)*2; line+=2, space--)
	    {
	      //여기서부터 진짜 시작
	      
	      int mok1 = line/10;  //숫자가 9를 넘어가면 0부터 다시 시작하도록
	      int mok2 = (line+1)/10;

	      //공백을 먼저 출력, 그 후에 숫자, 다시 공백
	      int k = 0;
	      while(k < space)
	      {
	        System.out.printf(" ");
	        k++;
	      }

	      //숫자 출력
	      //만약 숫자가 10보다 크면 1의자리 숫자로 만들어주어야함.
	      if(line == (lineNumber-1)*2-1)
	      {
	    	 
	        for(int i = line; i < line + (lineNumber*2)-1; i ++)
	        {
	          if((i/10)>0)
	          {
	            System.out.printf("%d",i - (i/10)*10);
	          }
	          else
	          {
	            System.out.printf("%d", i);
	          }
	        }
		      
	      }
	      else 
	      {
	    	  if(mok1 > 0)
		      {
		        System.out.printf("%d", line - (mok1*10));
		      }
		      else
		      {
		        System.out.printf("%d", line);
		      }
	      }
	      
	      //다시 공백출력
	      for(int i = 0; i < line; i ++)
	      {
	        System.out.printf(" ");
	      }

	      //다시 숫자출력
	      if(mok2 > 0)
	      {
	    	if(line > (lineNumber-1)*2-3)
	    	{
	    		System.out.printf("");
	    	}
	    	else
	    	{
	    		System.out.printf("%d", (line+1) - (mok2*10));
	    	}
	        
	      }
	      else
	      {
	        System.out.printf("%d",line + 1);
	      }
	      
	      System.out.println();
	      
	      

	    }
	  }
	
}

