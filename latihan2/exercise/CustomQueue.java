package exercise;

public class CustomQueue<E> {
    
    private Node<E> head;

    /**
     * Constructor.
     */
    public CustomQueue() {

    }

    /**
     * Add item to queue.
     */
    public E addItem(E item) {
        if (head == null) {
            head = new Node<E>(item);
            return item;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<E>(item);
        return item;
    }

    /**
     * Remove item from queue
    */
    public void removeItem() {
        if (head == null) {
            return;
        }
        Node<E> next = head.next;
        head.data = null;
        head.next = null;
        head = next;
    }

    /**
     * Showing the queue
     */
    public void showData() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node<E> current = head;
        while (current != null) {
            E data = current.data;
            System.out.print(data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
