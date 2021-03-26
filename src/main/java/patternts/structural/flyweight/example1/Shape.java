package patternts.structural.flyweight.example1;

import java.awt.*;

public interface Shape {
    void draw(Graphics g, int x, int y,
              int width, int height, Color color);
}
