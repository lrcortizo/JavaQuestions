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
		assertThat("Fizz", equalTo(fizzBuzz.run(3)));
		assertThat("Buzz", equalTo(fizzBuzz.run(5)));
		assertThat("FizzBuzz", equalTo(fizzBuzz.run(15)));
		assertThat("2", equalTo(fizzBuzz.run(2)));
	}
}
