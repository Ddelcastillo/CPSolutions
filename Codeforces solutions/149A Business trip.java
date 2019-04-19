import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class problemFlor
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Integer K=Integer.parseInt(bf.readLine());
		String meses[]=bf.readLine().split(" ");
		ArrayList<Integer> x=new ArrayList<>();
		for (int j = 0; j < meses.length; j++)
		{
			x.add(Integer.parseInt(meses[j]));
		}
		int cont=0;
		int Sum=0;
		boolean f=true;
		while(Sum<K)
		{
			if(x.size()>0)
			{
				Sum+=Collections.max(x);
				x.remove(Collections.max(x));
				cont++;
			}
			else
			{
				f=false;
				System.out.println(-1);
				break;
			}
		}
		if(f)
			System.out.println(cont);
	}
}