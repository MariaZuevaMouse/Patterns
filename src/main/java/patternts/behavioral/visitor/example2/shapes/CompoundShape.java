package patternts.behavioral.visitor.example2.shapes;

import patternts.behavioral.visitor.example2.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        //move
    }

    @Override
    public void draw() {
        //draw
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphics(this);
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape){
        children.add(shape);
    }
}
