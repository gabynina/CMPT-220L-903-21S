package base;

public class Node {
    int value;
    Node listItem;

    public Node(int value){
        this.value = value;
        this.listItem = null;
    }
    public Node head = null;
    public Node tail = null;

    public Node addEnd(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.listItem = newNode;
            tail = newNode;
        }
        return newNode;
    }

    public void show(){
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current!= null) {
            System.out.print(current.value + " ");
            current = current.listItem;
        }
        System.out.println();
    }

    public void delete(int removable){
        Node now = head, current = null;

        if(now != null && now.value == removable){
            head = now.listItem;
            return;
        }

        while(now != null && now.value != removable){
            current = now;
            now = now.listItem;
        }

        if (now == null)
            return;
        current.listItem = now.listItem;
    }

    public void sort(){
        Node current = head, next = null;

        int now;
        if(head == null){
            return;
        }
        else {
            while (current != null){
                next = current.listItem;

                while (next != null){
                    if (current.value > next.value){
                        now = current.value;
                        current.value=next.value;
                        next.value = now;
                    }
                    next = next.listItem;
                }
                current = current.listItem;
            }
        }
    }
}
