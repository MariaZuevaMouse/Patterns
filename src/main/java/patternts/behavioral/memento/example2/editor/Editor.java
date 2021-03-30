package patternts.behavioral.memento.example2.editor;

import patternts.behavioral.memento.example2.commands.Command;
import patternts.behavioral.memento.example2.history.History;
import patternts.behavioral.memento.example2.history.Memento;
import patternts.behavioral.memento.example2.shapes.CompoundShape;
import patternts.behavioral.memento.example2.shapes.Shape;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

public class Editor extends JComponent {
    private  Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes){
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes(){
        return allShapes;
    }

    public void execute(Command c){
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo(){
        if(history.undo()){
            canvas.repaint();
        }
    }

    public void redo(){
        if(history.redo()){
            canvas.repaint();
        }
    }

    public String backup(){
        try{
            ByteArrayOutputStream boas = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(boas);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(boas.toByteArray());
        }catch (IOException e){
            return "";
        }
    }

    public void restore(String state){
        try{
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShape) ois.readObject();
            ois.close();
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException occurred");
        }catch (IOException e){
            System.out.println("IOException occurred");
        }
    }
}
