package dcll.ssli;

import java.util.EmptyStackException;

/**
 * Created by Skander on 27/02/2015.
 */
public class MySimpleStack implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
