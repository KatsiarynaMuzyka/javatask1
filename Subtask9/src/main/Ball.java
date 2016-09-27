package main;

public class Ball {
	private double weight;
	private Color cr;

	public static enum Color {
		RED, WHITE, GREEN, BLUE, YELLOW
	};

	public Ball() {
	}

	public Ball(double weight, Color cr) {
		if (weight == 0 || cr == null) {
			throw new IllegalArgumentException("Не задан вес или цвет мяча");
		} else {
			this.weight = weight;
			this.cr = cr;
		}
	}

	public double getWeight() {
		return weight;
	}

	public Color getCr() {
		return cr;
	}

}
