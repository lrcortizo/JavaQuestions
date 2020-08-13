package questions;

public class AdditionOperation implements Operation {

	public int calculate(Node leftNode, Node rightNode) {
		return leftNode.calculate() + rightNode.calculate();
	}
}
