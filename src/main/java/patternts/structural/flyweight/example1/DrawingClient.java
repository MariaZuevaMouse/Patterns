package patternts.structural.flyweight.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingClient extends JFrame {
    private static final long serialVersionUID =-1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE,
    ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};

    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public DrawingClient(int WIDTH, int HEIGHT) throws HeadlessException {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
                }
            }
        });
    }

    private Color getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private int getRandomHeight() {
        return (int) (Math.random()*(HEIGHT/10));
    }

    private int getRandomWidth() {
        return (int) (Math.random()*(WIDTH/10));
    }

    private int getRandomY() {
        return (int) (Math.random()*HEIGHT);
    }

    private int getRandomX() {
        return (int) (Math.random()*WIDTH);
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random()* shapes.length)];
    }



    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500, 600);
    }
}
