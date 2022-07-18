package DesignPattern.Strategy;

public class Moving {
    private MoveableStrategy moveableStrategy;

    public void move() {
        moveableStrategy.move();
    }

    public void setMoveableStrategy(MoveableStrategy moveableStrategy) {
        this.moveableStrategy = moveableStrategy;
    }
}
