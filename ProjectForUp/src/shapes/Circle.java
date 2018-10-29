
package shapes;

import java.util.ArrayList;

public class Circle extends Shapes {
    
    public Circle(int x, int y, int length) {
        super(x, y, length, "C");
    }
	@Override
	public double qwerty() {
		return Math.pow(getLength()*2, 2);
	} 
}
