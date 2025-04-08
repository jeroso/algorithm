package practice.programmers.level1;

//https://velog.io/@se_bb/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EA%B3%B5%EC%9B%90-%EC%82%B0%EC%B1%85
public class 공원산책 {
    //todo: 다시 풀어보기
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1;
        int height = park.length;
        int weight = park[0].length();

        //x,y 시작 값 초기화
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf('S') == -1) {
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            String vector = split[0];
            int distance = Integer.parseInt(split[1]);
            if (vector == "E") {
                boolean flag = true;


            }
        }

        //벗어나거나, 장애물이 있을 시 해당 명령 무시

        return answer;
    }
    public static void main(String[] args) {
        공원산책 main = new 공원산책();
        String[] park = {"SOO", "OOO", "OOO"};
        String[] route = {"E 2", "S 2", "W 1"};
        main.solution(park, route);
    }
}
