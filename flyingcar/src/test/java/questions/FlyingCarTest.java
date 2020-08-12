package questions;

import org.junit.Before;
import org.junit.Test;

public class FlyingCarTest {
	
	private Aeroplane aeroplane;
	private Car car;
	private FlyingCar flyingCar;
	
	@Before
	public void setup() {
		aeroplane = new Aeroplane();
		car = new Car();
		flyingCar = new FlyingCar();
	}
	
	@Test
	public void testFlyingCar() {
		System.out.println("--COMPARING FLIGHTS--\nFlyingCar:");
		flyingCar.fly();
		System.out.println("Aeroplane:");
		aeroplane.fly();
		System.out.println("--COMPARING DRIVING--\nFlyingCar:");
		flyingCar.drive();
		System.out.println("Car:");
		car.drive();
	}

}
