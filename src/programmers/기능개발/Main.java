package programmers.기능개발;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

}

//public int[] Main(int[] progresses, int[] speeds){
//    Stack<Integer> stack = new Stack<>();
//
//    for(int i = progresses.length; i >= 0; i--){
//        stack.add((100- progresses[i] / speeds[i] + ((100 - progresses[i] % speeds[i] > 0 ? 1 : 0))));
//    }
//    List<Integer> s = new ArrayList<>();
//
//    while (!stack.isEmpty()) {
//        int cnt = 1;
//
//        int top = stack.pop();
//
//        while (!stack.isEmpty() && stack.peek() <= top) {
//            cnt++;
//            stack.pop();
//        }
//
//        s.add(cnt);
//    }
//
//    int[] answer = new int[s.size()];
//
//    for (int i = 0; i < answer.length; i++) {
//        answer[i] = s.get(i);
//    }
//    return answer;
//}