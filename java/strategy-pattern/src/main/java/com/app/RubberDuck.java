package com.app;

public class RubberDuck extends Duck {

	RubberDuck() {
		
		flyBehavior = new FlyNoWay();
		speakBehavior = new Squeak();
	}

	public void display() {
		System.out.println("I'm a rubber duck..");
	}
}