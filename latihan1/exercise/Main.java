package exercise;

public class Main {
    public static void main(String[] args) {
        CustomStack<String> st = new CustomStack<>();

        st.addItem("Aku");
        st.addItem("Anak");
        st.addItem("Indonesia");

        System.out.println("Next: " + st.peekItem());
        st.addItem("Raya");
        System.out.println(st.removeItem());
        st.addItem("!");

        System.out.println(st.toString());
    }
}
