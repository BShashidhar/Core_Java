package map;

public class Rectangle {

	private int length;
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
public int getPerimeter()
{
	int res=2*(this.getLength()+this.getBreadth());
	return res;
	
}
}
