package patternts.behavioral.iterator.dinnermerger;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public ArrayListIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>= items.size())return false;
        else return true;
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position = position+1;
        return object;
    }
}
