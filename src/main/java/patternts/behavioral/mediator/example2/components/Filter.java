package patternts.behavioral.mediator.example2.components;

import patternts.behavioral.mediator.example2.mediator.Mediator;
import patternts.behavioral.mediator.example2.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private  Mediator mediator;
    private ListModel listModel;

    public Filter() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Processes any key events that the component itself
     * recognizes.  This is called after the focus
     * manager and any interested listeners have been
     * given a chance to steal away the event.  This
     * method is called only if the event has not
     * yet been consumed.  This method is called prior
     * to the keyboard UI logic.
     * <p>
     * This method is implemented to do nothing.  Subclasses would
     * normally override this method if they process some
     * key events themselves.  If the event is processed,
     * it should be consumed.
     *
     * @param e
     */
    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        super.processComponentKeyEvent(e);
        String start = getText();
        searchElements(start);
    }

    public void  setList(ListModel listModel){
        this.listModel  = listModel;
    }

    private void searchElements(String s) {
        if(listModel == null){
            return;
        }

        if(s.equals("")){
            mediator.setElementList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note)listModel.getElementAt(i));
        }

        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for(Note note: notes){
            if(note.getName().contains(s)){
                listModel.addElement(note);
            }
        }
        mediator.setElementList(listModel);
    }

    @Override
    public String getName(){
        return "Filter";
    }
}
