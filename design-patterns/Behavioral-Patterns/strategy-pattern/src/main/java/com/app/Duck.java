package com.app;

public abstract class Duck {

	FlyBehavior flyBehavior;
	SpeakBehavior speakBehavior;

	public Duck() {}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setSpeakBehavior(SpeakBehavior sp) {
		speakBehavior = sp;
	}

	public void performFly() {
		flyBehavior.fly();
	}
	public void performSpeak() {
		speakBehavior.speak();
	}

	abstract void display();

 	public void swim() {
 		System.out.println("all ducks can swim..");
 	}
}