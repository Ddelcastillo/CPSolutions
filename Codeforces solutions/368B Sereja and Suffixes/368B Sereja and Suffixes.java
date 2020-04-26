import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Problem P368B: Sereja and Suffixes
public class P368B
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
    public static int m;
    public static int u;
    public static Integer[] x;
    public static Integer[] a;
    public static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException
    {
        Integer[] data = strToIntArr(br.readLine());
        n = data[0];
        m = data[1];
        x = new Integer[n];
        a = strToIntArr(br.readLine());
        map = new HashMap<>(n);
        u = 0;
        for(Integer act : a)
        {
            if(!map.containsKey(act))
            {
                ++u;
                map.put(act, 1);
            }
            else
                map.put(act, map.get(act)+1);
        }
        int i;
        for(i = 0; i < n; ++i)
        {
            x[i] = u;
            map.put(a[i], map.get(a[i])-1);
            if(map.get(a[i]) == 0)
                --u;
        }
        int y;
        for(i = 0; i < m; ++i)
        {
            y = Integer.parseInt(br.readLine());
            bw.write(x[y-1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
