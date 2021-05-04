package base;

public class Main {

    public static void main(String[] args) {
        Node glist = new Node(1);

        glist.addEnd(3);
        glist.show();

        glist.addEnd(2);
        glist.show();

        glist.addEnd(1);
        glist.show();

        glist.delete(3);
        glist.show();

        glist.sort();
        glist.show();







    }
}
