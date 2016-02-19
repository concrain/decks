package com.app;

public class StrategyDemo {

   public static void main(String[] args) {
   	
   		RubberDuck rubber = new RubberDuck();
   		MallardDuck mallard = new MallardDuck();

   		rubber.display();
   		rubber.performSpeak();
   		rubber.performFly();
   		rubber.setFlyBehavior(new FlyWithBubbles());
   		rubber.performFly();
   }
}