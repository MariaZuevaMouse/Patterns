package patternts.behavioral.visitor.example2.visitor;

import patternts.behavioral.visitor.example2.shapes.Circle;
import patternts.behavioral.visitor.example2.shapes.CompoundShape;
import patternts.behavioral.visitor.example2.shapes.Dot;
import patternts.behavioral.visitor.example2.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphics(CompoundShape cg);
}
