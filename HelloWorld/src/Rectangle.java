
public class Rectangle {
	
	//adding properties for the Rectangle class
	public int width;
	public int height; 
	
	public int getArea() {
		return height * width;
	}
	
	public int getPerimeter() {
		return 2*( height + width);
	}
	
	public Rectangle (int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle() {}
	
}
