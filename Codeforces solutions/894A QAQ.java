import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem P84A: QAQ
public class P894A
{
    /* Template code starts here. */
    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in,StandardCharsets.UTF_8));

    public static class Pair<T1, T2>
    {
        public T1 left; public T2 right;
        public Pair(T1 pLeft, T2 pRight)
        { this.left = pLeft; this.right = pRight; }
    }

    public static int gcd(int a, int b)
    { while(b != 0) { int t = a; a = b; b = t % b; } return a; }

    public static Integer[] strToIntArr(String s)
    {
        List<Integer> list = new ArrayList<>();
        Arrays.asList(s.split(" ")).forEach(s1 -> list.add(Integer.parseInt(s1)));
        return list.toArray(new Integer[0]);
    }
    /* Template code ends here. */


    public static void main(String[] args) throws IOException
    {
        char[] chars = br.readLine().toCharArray();
        ArrayList<Character> ns = new ArrayList<>();
        for(char act : chars)
        {
            if(act == 'Q' || act == 'A')
                ns.add(act);
        }
        int count = 0;
        for(int i = 0; i < ns.size(); ++i)
        {
            if(ns.get(i) == 'Q')
            {
                for(int j = i+1; j < ns.size(); ++j)
                {
                    if(ns.get(j) == 'A')
                    {
                        for(int k = j+1; k < ns.size(); ++k)
                        {
                            if(ns.get(k) == 'Q')
                                ++count;
                        }
                    }
                }
            }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
