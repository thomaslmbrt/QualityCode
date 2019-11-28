public class LinkedList {

    private Node    head = null;

    public LinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }
    public void setHead(Node queue) {
        this.head = queue;
    }

    public void addAtHead(int value) {
        Node newNode = new Node(value);

        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void addAtQueue(int value) {
        Node newNode = new Node(value);

        Node actualNode = this.head;

        while (actualNode != null && actualNode.getNext() != null) {
            actualNode = actualNode.getNext();
        }

        newNode.setNext(null);
        actualNode.setNext(newNode);
    }

    public void addAtPosition(int value, int position) {
        Node    newNode = new Node(value);
        Node    actualNode = this.getNodeBeforePosition(position);

        System.out.println("actual node:" + actualNode.getValue());
        if (actualNode.getNext() != null) {
            newNode.setNext(actualNode.getNext());
        }
        actualNode.setNext(newNode);
    }

    public int getAtPosition(int position) {
        int     nodeCount = 1;
        Node    actualNode = this.head;

        while (actualNode != null && actualNode.getNext() != null && nodeCount < position) {
            nodeCount++;
            actualNode = actualNode.getNext();
        }

        return actualNode.getValue();
    }

    public int getLength() {
        int     nodeCount = 0;
        Node    actualNode = this.head;

        while (actualNode != null) {
            nodeCount++;
            System.out.println("Node value" + actualNode.getValue());
            actualNode = actualNode.getNext();
        }

        return nodeCount;
    }

    private Node getNodeBeforePosition(int position) {
        int     beforePos = 1;
        int     nodeCount = 1;
        Node    actualNode = this.head;

        while (actualNode != null && actualNode.getNext() != null && nodeCount < position - beforePos) {
            nodeCount++;

            actualNode = actualNode.getNext();
        }

        return actualNode;
    }
}
