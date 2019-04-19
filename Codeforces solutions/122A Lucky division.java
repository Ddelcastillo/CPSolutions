import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.SynchronousQueue;

public class Num4
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String num[]=bf.readLine().split(" ");
		int A=Integer.parseInt(num[0]);

		int[] nums={4,7,44,47,74,77,444,474,477,777,747,744};

		boolean entro=false;
		for (int i = 0; i < nums.length; i++)
		{
          if(A%nums[i]==0)
          {
        	  entro=true;
        	 break;
          }
		}

		if(entro)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}