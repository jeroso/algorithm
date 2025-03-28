package practice.inflearn.stackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class 응급실_08 {
    // 내가 푼 방법 > 실패 (속도)
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i : arr) {
            queue.add(i);
        }
        int target = arr[m];
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            boolean isMax = true;
            for (Integer i : queue) {
                if (poll < i) {
                    isMax = false;
                }
            }
            if (isMax) {
                answer++;
                if (poll == target) return answer;
            }else{
                queue.add(poll);
            }

        }

        return answer;
    }

    //강의에서 푼 방법
    public int solution2(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person person : queue) {
                if (person.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer ++;
                if(temp.id == m) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        응급실_08 main = new 응급실_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = main.solution2(n, m, arr);
        System.out.println(solution);
    }
}
