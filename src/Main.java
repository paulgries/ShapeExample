import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 30);
        Circle c1 = new Circle(10);
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(r1);
        myShapes.add(r2);
        myShapes.add(c1);
        System.out.println(calculateTotalArea(myShapes));
    }

    private static double calculateTotalArea(List<Shape> myShapes) {
        double totalArea = 0;
        for (Shape shape : myShapes) {
                totalArea += shape.getArea();
        }

        return totalArea;
    }
}