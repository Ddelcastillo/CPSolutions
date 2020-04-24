import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem P580A: Kefa and First Steps
public class P580A
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
        int longest = 1;
        int current = 1;
        for(int i = 1; i < n; ++i)
        {
            if(nums[i] >= nums[i-1])
            {
                if(++current > longest)
                    longest = current;
            }
            else
                current = 1;
        }
        bw.write(longest + "\n");
        bw.close();
        br.close();
    }
}
