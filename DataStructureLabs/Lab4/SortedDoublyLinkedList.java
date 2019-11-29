//using the file linkedlist.java 
public class SortedDoublyLinkedList<T extends Comparable<T>> implements LinkedList<T> {
    //store indivisual elements in the list
    public class Node{
        public Node previous;
        public Node next;
        public  T type;

        public Node(T type){ this.type = type;}
        public T getType() { return type; }
        public Node getNext() { return next; }
        public String toString() { return type.toString(); }

    }
    //private classes
    private Node head;
    private int count;
    private Comparable<T> c;
    public SortedDoublyLinkedList() {
        this(null);
    }
    //new class for sorterddoublylinkedlist
    public SortedDoublyLinkedList(Comparable<T> c) {
        this.head = null;
        this.count = 0;
        this.c = c;
    }

    @Override
    public void insert(T type) {
        Node newNode = new Node(type);
        Node previousNode = null;
        if (this.count == 0) this.head = newNode;
        else {
            boolean isThere = false;
            Node node = this.head;
            //while node and  isthere is not null
            while (!isThere && node != null) {
                int r = type.compareTo(node.getType());
                if (r >= 0) {
                    //if previous node is null
                    if (node.previous == null) this.head = newNode;
                    else{
                        newNode.previous=node.previous;
                        node.previous.next = newNode;
                    }
                    node.previous = newNode;
                    newNode.next = node;
                    isThere = true;
                }
                if (node.next == null) previousNode = node;
                node = node.next;
            }
        }
        this.count++;
    }
    //sepetaring warriors by spaces
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        if (this.count > 0) {
            Node node = this.head;
            while (node != null) {
                sb.append(node + " ");
                node = node.getNext();
            }
        }
        sb.append(']');
        return sb.toString();

    }
}