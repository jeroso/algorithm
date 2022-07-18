package DesignPattern.Singleton;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SingtonObj obj = SingtonObj.getInstance();
            System.out.println(obj.toString());
        }
    }
}
