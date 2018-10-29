
package shapes;



public abstract class Shapes {

    private int x;
    private int y;
    private int length;
    private String kind;
   

    public Shapes(int x, int y, int length, String kind) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.kind = kind;
    }
    public abstract double qwerty();

 
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y= y;
    }

    public String getKind() {
        return kind;
    }
    
    public int getLength() {
    	return length;
    }
    public void setLength(int length) {
    	this.length =length;
    }
    
    @Override
    public String toString() {
        return "Kind: " + kind +", X: " + x + ", Y: " + y + ", length: " + length;
    }
    
}
