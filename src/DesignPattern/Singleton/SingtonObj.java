package DesignPattern.Singleton;

public class SingtonObj {
    private static SingtonObj singtonObj = null;

    private SingtonObj() {
    }

    public static SingtonObj getInstance() {
        if (singtonObj == null) {
            singtonObj = new SingtonObj();
        }
        return singtonObj;
    }
}
