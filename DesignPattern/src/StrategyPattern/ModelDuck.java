package StrategyPattern;
import StrategyPattern.Fly.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("Im a model duck");
    }

}
