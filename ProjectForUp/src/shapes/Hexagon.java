package shapes;


public class Hexagon extends Shapes{

    public Hexagon(int x, int y, int length) {
        super(x, y, length, "H");
        
    }

	@Override
	public double qwerty() {
		return (Math.pow(getLength(), 2)*Math.sqrt(3)*3)/2;
	}
}
