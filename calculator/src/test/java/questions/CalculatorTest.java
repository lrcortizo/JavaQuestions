package questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Operation substractionOperation;

	@Before
	public void setup() {
		substractionOperation = new SubstractionOperation();
	}

	@Test
	public void substractionOperationTest() {
		// 10 - 6
		Node minus = new Node(substractionOperation, 0);
		Node ten = new Node(null, 10);
		Node six = new Node(null, 6);
		minus.setLeftNode(ten);
		minus.setRightNode(six);
		int result = minus.calculate();
		System.out.println("Example substraction operation added, result of 10 - 6: " + result);

		assertThat(4, equalTo(result));
	}
}
