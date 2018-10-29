

package shapes;

public class Square extends Shapes{

    public Square(int x, int y, int length) {
        super(x, y, length, "S");
              
    }

	@Override
	public double qwerty() {
		return Math.pow(getLength(), 2);
	}    
}
