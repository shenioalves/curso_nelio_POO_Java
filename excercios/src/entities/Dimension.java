package entities;

public class Dimension {
	public double width;
	public double heigth;
	
	public double area() {
		return width*heigth;
	}
	
	public double perimeter() {
		return 2*(width+heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(width*width+heigth*heigth);
	}
	
	public String toString() {
		return "\nAREA = " 
				+ String.format("%.2f", area())
				
				+ "\nPERIMETER = "
				+ String.format("%.2f", perimeter())
				+ "\n3DIAGONAL = "
				+ String.format("%.2f", diagonal());
	}
	
	
	

}
