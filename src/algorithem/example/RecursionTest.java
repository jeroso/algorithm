package algorithem.example;

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest rt = new RecursionTest();
        rt.dfs(5);
    }

    public void dfs(int n) {
        if(n == 0) return;

        dfs(n - 1);
        System.out.print(n + " ");
    }
}
