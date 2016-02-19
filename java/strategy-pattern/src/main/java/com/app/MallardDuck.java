package com.app;

public class MallardDuck extends Duck {

	MallardDuck() {

		speakBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real duck..");
	}
}