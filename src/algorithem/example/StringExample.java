package algorithem.example;

public class StringExample {
    public static void main(String[] args) {
        String str = "안녕하세요,만나서-반갑습니다.";
        String[] strArr = str.split(",|-");
        for (String s : strArr) {
            System.out.println("s = " + s);
        }
    }
}
