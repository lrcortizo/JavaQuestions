import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

	private Rectangle rectangle;
	private Shape customRectangle;
	private final String RED_BORDER = "red";
	private final String THICK_BORDER_TYPE = "thick pen";

	@Before
	public void setup() {
		rectangle = new Rectangle();
	}

	/**
	 * Sample run test
	 */
	@Test
	public void testShape() {
		System.out.println("--SIMPLE RECTANGLE--");
		rectangle.draw();

		System.out.println("--CUSTOM RECTANGLE--");
		BorderColorDecorator borderColorDecoratorRectangle = new BorderColorDecorator(rectangle, RED_BORDER);
		BorderTypeDecorator borderTypeDecoratorRectangle = new BorderTypeDecorator(borderColorDecoratorRectangle,
				THICK_BORDER_TYPE);
		customRectangle = borderTypeDecoratorRectangle;
		customRectangle.draw();
	}
}
