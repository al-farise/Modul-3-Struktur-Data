package exercise;

public class Node<E> {

    public E data;
    public Node<E> next;

    /**
     * Constructor.
     */
    public Node(E data) {
        this.data = data;
    }
}
