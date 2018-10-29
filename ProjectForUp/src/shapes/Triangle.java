package shapes;


public class Triangle extends Shapes{

    public Triangle(int x, int y, int length) {
        super(x, y,length, "T");
    }

	@Override
	public double qwerty() {
		return Math.sqrt(3)*Math.pow(getLength(), 2)/2;
	}    
}
