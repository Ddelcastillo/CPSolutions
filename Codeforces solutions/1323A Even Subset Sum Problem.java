import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem 398B: Painting the Wall
public class P1323A
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

    public static int t;
    public static int n;

    public static void main(String[] args) throws IOException
    {
        t = Integer.parseInt(br.readLine());
        int i, count, first;
        boolean out;
        for(int testCase = 0; testCase < t; ++testCase)
        {
            n = Integer.parseInt(br.readLine());
            Integer[] array = strToIntArr(br.readLine());
            count = 0;
            first = 0;
            out = false;
            for(i = 0; !out && i < n; ++i)
            {
                if(array[i] % 2 == 0)
                {
                    bw.write(1 + "\n" + (i + 1) + "\n");
                    out = true;
                }
                else
                {
                    if(count == 0)
                    {
                        first = i+1;
                        ++count;
                    }
                    else
                    {
                        bw.write(2 + "\n" + first + " " + (i+1) + "\n");
                        out = true;
                    }
                }
            }
            if(!out)
                bw.write("-1\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
