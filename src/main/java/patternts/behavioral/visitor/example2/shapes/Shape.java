package patternts.behavioral.visitor.example2.shapes;

import patternts.behavioral.visitor.example2.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
