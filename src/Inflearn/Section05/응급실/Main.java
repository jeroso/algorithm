package Inflearn.Section05.응급실;

import BOJ_basic.FastReader;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    class Person{
        private int id;
        private int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
    public int Solution(int[] arr, int m) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person poll = Q.poll();
            for (Person person : Q) {
                if (person.priority > poll.priority) {
                    Q.offer(poll);
                    poll = null;
                    break;
                }
            }
            if (poll != null) {
                answer++;
                if(poll.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        Main main = new Main();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int solution = main.Solution(arr, m);
        System.out.println(solution);
    }
}
