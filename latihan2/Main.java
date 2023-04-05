import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");

        System.out.println("Remove: " + queue.remove());
        System.out.println("Element: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
    }
}