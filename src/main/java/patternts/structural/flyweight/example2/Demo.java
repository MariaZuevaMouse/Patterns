package patternts.structural.flyweight.example2;

import patternts.structural.flyweight.example2.forest.Forest;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPE = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW/TREE_TYPE); i++) {
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");

        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("--------------------------------");
        System.out.println("Memory usage: ");
        System.out.println("Tree size (8 bytes) * " +TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPE + " ");
        System.out.println("---------------------------------");
        System.out.println("Total: " +((TREES_TO_DRAW*8 +TREE_TYPE*30)/1024/1024) +
                "MB (instead of " + ((TREES_TO_DRAW*38)/1024/1024) + "MB)");
    }
    private  static  int random(int min, int max){
        return min + (int) (Math.random()* ((max-min)+1));
    }
}