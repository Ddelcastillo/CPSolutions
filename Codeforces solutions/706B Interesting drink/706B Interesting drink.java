import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem P706B
public class P706B
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

    public static int n;
    public static int q;
    public static Integer[] x;

    public static void main(String[] args) throws IOException
    {
        n = Integer.parseInt(br.readLine());
        x = strToIntArr(br.readLine());
        q = Integer.parseInt(br.readLine());
        Arrays.sort(x);
        long act;
        for(int i = 0; i < q; ++i)
        {
            act = Long.parseLong(br.readLine());
            int low = 0;
            int high = x.length;
            int mid;
            if(act >= x[x.length-1])
                bw.write(x.length + "\n");
            else if(act < x[0])
                bw.write(0 + "\n");
            else
            {
                // We want the immediate higher index to act in x.
                while (low <= high)
                {
                    mid = (low + high) / 2;
                    if (x[mid] <= act)
                        low = mid + 1;
                    else if (x[mid] > act)
                        high = mid - 1;
                }
                bw.write(low + "\n");
            }
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
