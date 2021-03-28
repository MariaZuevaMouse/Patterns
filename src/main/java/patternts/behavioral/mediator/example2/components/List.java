package patternts.behavioral.mediator.example2.components;

import patternts.behavioral.mediator.example2.mediator.Mediator;
import patternts.behavioral.mediator.example2.mediator.Note;

import javax.swing.*;

public class List extends JList implements Component {
    private  Mediator mediator;
    private final  DefaultListModel LIST_MODEL;

    /**
     * Constructs a <code>JList</code> with an empty, read-only, model.
     */
    public List(DefaultListModel LIST_MODEL) {
        super(LIST_MODEL);
        this.LIST_MODEL = LIST_MODEL;
        setModel(LIST_MODEL);
        this.setLayoutOrientation(JList.VERTICAL);
        Thread thread = new Thread(new Hide(this));
        thread.start();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void  addElement(Note note){
        LIST_MODEL.addElement(note);
        int index = LIST_MODEL.size()-1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(LIST_MODEL);
    }

    public void  deleteElement(){
        int index = this.getSelectedIndex();
        try{
            LIST_MODEL.remove(index);
            mediator.sendToFilter(LIST_MODEL);
        }catch (ArrayIndexOutOfBoundsException ignored){}

    }

    public Note getCurrentElement(){
        return (Note)getSelectedValue();
    }

    @Override
    public String getName(){
        return "List";
    }

    private class Hide implements Runnable{
        private List list;

        public Hide(List list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if(list.isSelectionEmpty()){
                    mediator.hideElements(true);
                }else {
                    mediator.hideElements(false);
                }
            }
        }
    }
}
