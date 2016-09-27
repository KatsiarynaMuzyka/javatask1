package basket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Ball;
import main.Basket;
import main.Ball.Color;

public class TestBasket {
	Basket basket = new Basket();
	
	@Before
	public void ballCreation() {
		basket.add(new Ball(2.1, Color.BLUE));
		basket.add(new Ball(3.7, Color.BLUE));
		basket.add(new Ball(7.3, Color.GREEN));
		basket.add(new Ball(1.1, Color.YELLOW));
	}
	
	@Test
	public void tstBacketCountWeightPositive() {
		assertEquals(14.20, basket.countWeight(), 0.01);
	}
	
	@Test
	public void tstBacketCountWeightNegative() {
		assertNotEquals(10, basket.countWeight(), 0.01);
	}
	
	@Test
	public void tstBacketCountBlueBallsPositive() {
		assertEquals(2, basket.countBlueBalls());
	}
	
	@Test
	public void tstBacketCountBlueBallsNegative() {
		assertNotEquals(5, basket.countBlueBalls());
	}

}
