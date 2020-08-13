package questions;

public class SubstractionOperation implements Operation {

	public int calculate(Node leftNode, Node rightNode) {
		return leftNode.calculate() - rightNode.calculate();
	}
}
