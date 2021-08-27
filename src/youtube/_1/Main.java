package youtube._1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student01 = new Student("1", "song");
        Student student02 = new Student("2", "kim");
        Student student03 = new Student("3", "ko");

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(student01);
        arr.add(student02);
        arr.add(student03);

        for (Student stu : arr) {
            System.out.println("stu.getNo() = " + stu.getNo());
            System.out.println("stu.getNo() = " + stu.getName());
        }
    }
}
