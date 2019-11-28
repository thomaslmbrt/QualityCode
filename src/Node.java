public class Node {

    private int     value;

    //private Node    prev;
    private Node    next;

    public Node(int value) {
        this.value = value;
        //this.prev = null;
        this.next = null;
    }

    public int  getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    /* public Node getPrev() {
        return this.prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    } */

    public Node getNext() {
        return this.next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
