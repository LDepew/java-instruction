import java.text.NumberFormat;

public class Rectangle {

	private int length;
	private int Width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	
	public Rectangle(double length2, double width2) {
		length = 0;
		Width = 0;
	}
	
	public int getArea() {
		 double area = Width * length;
		return (length + Width);
	
	}
	
	public void StrArea(String getArea) {
		NumberFormat StrArea = NumberFormat.getNumberInstance();
		
	}

	public int getPerimiter() {
        double perimeter = 2 * Width + 2 * length;
		return (length + Width);
	
	}
	
	public void StrPerimeter(String getPerimeter) {
		NumberFormat StrPerimiter = NumberFormat.getNumberInstance();
		
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		Width = width;
	}
	
	
}


