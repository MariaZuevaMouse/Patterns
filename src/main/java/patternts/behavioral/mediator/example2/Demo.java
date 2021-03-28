package patternts.behavioral.mediator.example2;

import patternts.behavioral.mediator.example2.components.*;
import patternts.behavioral.mediator.example2.mediator.Editor;
import patternts.behavioral.mediator.example2.mediator.Mediator;

import javax.print.attribute.standard.Media;
import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
