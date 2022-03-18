package fastCampus.Chapter2;

public class Chpater2Section1 {

    static class Elem implements Comparable<Elem> {
        public int num, idx;

        @Override
        public int compareTo(Elem other) {
            // TODO:
            // 정렬 조건에 맞게 정렬하기
            // 1. num의 비내림차순
            // 2. num이 같으면 idx 오름차순
            if(num != other.num) return num - other.num;
            return idx - other.idx;
        }
    }

    static int N;
    static int[] P;
    static Elem[] B;


    static void pro(){

    }

    static void input(){

    }

    public static void main(String[] args) {

    }

}
