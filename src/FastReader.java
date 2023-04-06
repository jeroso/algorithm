import java.io.*;
import java.util.StringTokenizer;

public class FastReader {
    static BufferedReader br;
    static StringTokenizer st;
    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public FastReader(String s) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(new File(s)));
    }
    public static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    public static int nextInt() {
        return Integer.parseInt(next());
    }
    public static long nextLong() {
        return Long.parseLong(next());
    }
    public static double nextDouble() {
        return Double.parseDouble(next());
    }
    public static String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

