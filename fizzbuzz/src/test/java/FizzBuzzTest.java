import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testFizzBuzz() {
		assertThat("1", equalTo(fizzBuzz.run(1)));
		assertThat("Fizz", equalTo(fizzBuzz.run(6)));
		assertThat("Buzz", equalTo(fizzBuzz.run(10)));
		assertThat("FizzBuzz", equalTo(fizzBuzz.run(30)));
		assertThat("98", equalTo(fizzBuzz.run(98)));
	}
}
