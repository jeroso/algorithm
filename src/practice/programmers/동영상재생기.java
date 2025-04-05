package practice.programmers;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class 동영상재생기 {
    static LocalTime videoTime;
    static LocalTime posTime;
    static LocalTime opStartTime;
    static LocalTime opEndTime;
    public static LocalTime calculator(String str) {
        String[] strings = str.split(":");
        int min = Integer.parseInt(strings[0]);
        int sec = Integer.parseInt(strings[1]);
        return LocalTime.of(0, min , sec);
    }

    public static void moveToNext() {
        posTime = posTime.plusSeconds(10);
        if (posTime.isAfter(videoTime)) {
            posTime = videoTime;
        }
    }

    public static void moveToPrev() {
        int minute = posTime.getMinute();
        int second = posTime.getSecond();
        if (minute == 0 && second < 10) {
            posTime = LocalTime.of(0, 0, 0);
        }
        else {
            posTime = posTime.minusSeconds(10);
        }
    }

    public static void skip() {
        if (posTime.isBefore(opEndTime) && posTime.isAfter(opStartTime)) {
            posTime = opEndTime;
        }
    }
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        videoTime = calculator(video_len);
        posTime = calculator(pos);
        opStartTime = calculator(op_start);
        opEndTime = calculator(op_end);

        skip();

        for (String command : commands) {
            if (command == "next") {
                moveToNext();
            } else {
                moveToPrev();
            }
        }
        skip();
        return posTime.format(DateTimeFormatter.ofPattern("mm:ss"));
    }

    public static void main(String[] args) {
        동영상재생기 main = new 동영상재생기();
        String video_len = "34:55";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] command = {"next", "prev"};
        String solution = main.solution(video_len, pos, op_start, op_end, command);
        System.out.println(solution);

    }
}
