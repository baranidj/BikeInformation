package org.bike;

public class Ktm implements Bikes {

	@Override
	public void cost() {
		System.out.println("my bike cost\t\t:\t2.8 laks");
		
	}

	@Override
	public void speed() {
		System.out.println("my overall speed\t:\t145 kmph");
		
	}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();k.speed();
}
}
