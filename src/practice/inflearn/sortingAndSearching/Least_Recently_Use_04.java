package practice.inflearn.sortingAndSearching;


import java.util.*;

public class Least_Recently_Use_04 {
    public List<Integer> solution(int n, int m, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (answer.contains(arr[i])) {
                answer.remove(Integer.valueOf(arr[i]));
                answer.add(arr[i]);
            } else{
                if (answer.size() >= n) {
                    answer.remove(0);
                }
                answer.add(arr[i]);
            }
        }
        Collections.reverse(answer);
        return answer;
    }

    public static void main(String[] args) {
        Least_Recently_Use_04 main = new Least_Recently_Use_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = main.solution(n, m, arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }
    }
}
