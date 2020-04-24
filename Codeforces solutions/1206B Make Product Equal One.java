import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem P1206B: Make Product Equal One
public class P1206B
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

    public static void main(String[] args) throws IOException
    {
        n = Integer.parseInt(br.readLine());
        Integer[] nums = strToIntArr(br.readLine());
        int countNegs = 0;
        int countZeros = 0;
        long cost = 0;
        for(long act : nums)
        {
            if(act <= -1)
            {
                cost += -act-1;
                ++countNegs;
            }
            else if(act >= 1)
                cost += act-1;
            else
                ++countZeros;
        }
        if(countZeros > 0)
            cost += countZeros;
        else
        {
            if (countNegs % 2 == 1)
                cost += 2;
        }
        bw.write(cost + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
