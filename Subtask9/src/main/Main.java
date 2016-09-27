package main;

import javax.swing.JOptionPane;

import main.Ball.Color;

public class Main {

	public static void main(String[] args) {
		Basket basket = new Basket();
		basket.add(new Ball(2.1, Color.BLUE));
		basket.add(new Ball(3.7, Color.BLUE));
		basket.add(new Ball(7.3, Color.GREEN));
		basket.add(new Ball(1.1, Color.YELLOW));
		StringBuffer sb = new StringBuffer().append(String.format("Weight of Balls: %.2f", basket.countWeight()) + "\n"
				+ "Count of Balls: " + basket.countBlueBalls());
		JOptionPane.showMessageDialog(null, sb.toString(), "Ball & Basket", JOptionPane.INFORMATION_MESSAGE);
	}

}
