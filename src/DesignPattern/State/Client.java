package DesignPattern.State;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerPush();
        laptop.setPowerStatus(Laptop.ON);
        laptop.powerPush();
    }
}
