package algorithem.example;

public class SortingEx {

    static class Elem implements Comparable<Elem> {

        public int num, idx;

        @Override
        public int compareTo(Elem o) {
            return num - o.num; // 음수 : num 먼저 , 양수 : o 먼저
        }
    }

}