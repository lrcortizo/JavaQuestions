package questions;

public class MultiplicationOperation implements Operation {
	
	public int calculate(Node leftNode, Node rightNode) {
		return leftNode.calculate() * rightNode.calculate();
	}
}
