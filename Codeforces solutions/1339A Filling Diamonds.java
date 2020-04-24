import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem P1339A: Filling Diamonds
public class P1339A
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
        for(int actCase = 0; actCase < t; ++actCase)
        {
            n = Integer.parseInt(br.readLine());
            bw.write(n + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
