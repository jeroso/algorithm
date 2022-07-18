package DesignPattern.Strategy;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        train.setMoveableStrategy(new RailLoadStrategy());
        bus.setMoveableStrategy(new LoadStrategy());
        train.move();
        bus.move();
        bus.setMoveableStrategy(new RailLoadStrategy());
        bus.move();
    }
}
