package questions;

public class Node {
	Operation operation;
	int value;
	Node leftNode;
	Node rightNode;

	public Node(Operation operation, int value) {
		this.operation = operation;
		this.value = value;
	}

	public int calculate() {
		if (operation != null) {
			return operation.calculate(leftNode, rightNode);
		}
		return value;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
