package StrategyPattern.Fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Im flying!!");
    }
}
