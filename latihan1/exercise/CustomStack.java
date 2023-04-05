package exercise;

import java.util.Vector;

public class CustomStack<E> extends Vector<E> {
    /**
     * Constructor.
     */
    public CustomStack() {

    }

    /**
     * Add element to stack.
     * @param item
     * @return added items
     */
    public E addItem(E item) {
        addElement(item);
        return item;
    }

    /**
     * Remove Element from stack.
     * @return item at the top of stack
     */
    public synchronized E removeItem() {
        removeElementAt(size() - 1);
        return peekItem();
    }

    /**
     * Get item at the top of stack.
     * @return item at the top of stack
     */
    public synchronized E peekItem() {
        if (size() == 0) {
            System.out.println("Stack is empty!");
        }
        return elementAt(size() - 1);
    }

    /**
     * @return true if contains no items.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @return the top of stack where item is located.
     */
    public synchronized int searchItem(E item) {
        int i = lastIndexOf(item);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }
}
