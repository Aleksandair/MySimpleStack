package dcll.ssli;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * My implementation of SimpleStack
 * Created by Skander on 27/02/2015.
 *
 * Un commentaire répondant à l'exigence #3.
 */
public class MySimpleStack implements SimpleStack {

    private Stack<Item> items = new Stack<Item>();

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void push(Item item) {
        items.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return items.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return items.pop();
    }
}
