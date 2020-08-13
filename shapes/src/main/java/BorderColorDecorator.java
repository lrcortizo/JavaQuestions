
public class BorderColorDecorator extends ShapeDecorator {
	
	private String borderColor;
	
	public BorderColorDecorator(Shape shape, String borderColor) {
		super(shape);
		this.borderColor = borderColor;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Border color: " + borderColor);
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
}
