
package shapes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Database {

    private final ArrayList<Shapes> shapes;
    private ArrayList<Double> findMax;

    public Database() {
        shapes = new ArrayList<>();
    }

    /**
     * read method, just reads information from txt file.
     * @param filename
     * @throws FileNotFoundException
     */
    public void read(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        int numShapes = sc.nextInt();
        while (sc.hasNext()) {
            Shapes shape = null;
            String kind = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int length = sc.nextInt();
            switch (kind) {
                case "C":
                    shape = new Circle(x, y, length);
                    break;
                case "H":
                    shape= new Hexagon(x, y, length);
                    break;
                case "T":
                    shape = new Triangle(x, y, length);
                    break;
                case "S":
                    shape = new Square(x, y, length);
                    break;
               
            }
            shapes.add(shape);
        }
    }
    public void findMax() {
        	 double Max=0;
        	 for (int i = 0; i < shapes.size(); i++) {
				if (shapes.get(i).qwerty()>Max) {
					Max=shapes.get(i).qwerty();
				}
			}
        	 System.out.println(Max);
 		}
         
    public void report() {
        System.out.println("Shapes:");
        for (Shapes a : shapes) {
            System.out.println(a);
        }
    }
   

    public void clear() {
        shapes.clear();
    }

}
