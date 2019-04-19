import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProblemA
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String num[]=bf.readLine().split(" ");
		String A=num[0];

		int contDef=0;
		int contTemp=0;

		for (int i = 0; i < A.length()-1; i++)
		{

			if(A.charAt(i)!=A.charAt(i+1))
			{
				contTemp=0;
				contDef++;
			}
			else
			{
				contTemp++;
				if(contTemp==5)
				{
					contDef++;
					contTemp=0;
				}
			}
		}

		contDef++;
		System.out.println(contDef);
	}
}
