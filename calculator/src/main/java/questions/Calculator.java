package questions;

/*
    Background:
    This calculator uses a single Node class to create a tree structure that is used to perform
    mathematical operations. Operations are performed in the Node.calculate() method.  Currently only
    addition and multiplication is supported.

    The problem:
    Now we want to make this calculator extensible, so that other developers can add new operations.
    Modify this class structure so that external can add new operations while respecting good OO
    practices.
    We should be able to distribute this code as a compiled .jar and developers should be able
    to add new types of operations at runtime.  As an example, demonstrate how subtraction would be added.

*/
public class Calculator {

	public void run() {
		// 2 + 3 * 4
		Operation multiplicationOperation = new MultiplicationOperation();
		Node times = new Node(multiplicationOperation, 0);
		Node three = new Node(null, 3);
		Node four = new Node(null, 4);

		// first 3 * 4
		times.setLeftNode(three);
		times.setRightNode(four);

		// then 2 + result above
		Node two = new Node(null, 2);
		Operation additionOperation = new AdditionOperation();
		Node plus = new Node(additionOperation, 0);

		plus.setLeftNode(two);
		plus.setRightNode(times);
		System.out.println(plus.calculate());
	}

	public static void main(String... args) {
		Calculator c = new Calculator();
		c.run();
	}
}
