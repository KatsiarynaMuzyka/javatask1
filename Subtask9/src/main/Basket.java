package main;

import java.util.ArrayList;
import main.Ball.Color;

public class Basket {
	private ArrayList<Ball> basket;

	public Basket() {
		basket = new ArrayList<Ball>();
	}

	public void add(Ball ob) {
		basket.add(ob);
	}

	public double countWeight() {
		double allWeight = 0;
		for (Ball ball : basket) {
			allWeight += ball.getWeight();
		}
		return allWeight;
	}

	public int countBlueBalls() {
		int blueBalls = 0;
		for (Ball ball : basket) {
			if (ball.getCr() == Color.BLUE) {
				blueBalls++;
			}
		}
		return blueBalls;
	}

}
