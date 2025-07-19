package AlgoUniversity.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FibonacciNumbers {
    static int n;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        takeInput();
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
    }
}
