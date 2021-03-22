package patternts.creational.prototype.example;

import patternts.creational.prototype.example.shapes.Circle;
import patternts.creational.prototype.example.shapes.Shape;
import patternts.creational.prototype.example.shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle secondCircle = (Circle)circle.clone();
        shapes.add(secondCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for(Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size() ; i++) {
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + " : Shapes are different objects !");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + " : And theay are identical");
                } else {
                    System.out.println(i + " : But they are not identical ");
                }
            }else {
                System.out.println(i + " : Shape objects are the same");
            }
        }
    }
}
