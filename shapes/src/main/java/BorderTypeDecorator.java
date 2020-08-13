
public class BorderTypeDecorator extends ShapeDecorator {
	
	private String borderType;
	
	public BorderTypeDecorator(Shape shape, String borderType) {
		super(shape);
		this.borderType = borderType;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Border type: " + borderType);
	}

	public String getBorderType() {
		return borderType;
	}

	public void setBorderType(String borderType) {
		this.borderType = borderType;
	}
}
