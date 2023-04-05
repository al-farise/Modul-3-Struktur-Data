package exercise;

public class Main {
    public static void main(String[] args) {
        CustomQueue<String> queue = new CustomQueue<>();

        queue.addItem("Java");
        queue.addItem("DotNet");
        queue.addItem("PHP");
        queue.addItem("HTML");
        queue.showData();
        
        queue.removeItem();
        queue.addItem("Python");
        queue.showData();
    }
}
