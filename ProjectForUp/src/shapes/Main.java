package shapes;
import java.io.FileNotFoundException;
import java.util.ArrayList;



public class Main {
	 public static void main(String[] args) {
		 ArrayList<Shapes>shapes=new ArrayList<>();
		 Database database = new Database();
	        try {
	            database.read("shapes.txt");
	        } catch (FileNotFoundException ex) {
	            System.out.println("File not found!");
	            System.exit(-1);
	            }
	        shapes.add(new Circle(0, 0, 0));
	        database.report();
	        database.findMax();
	 }
}