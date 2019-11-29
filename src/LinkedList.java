class LinkedList {

    private Node    head;
    private Integer length;
    private static final Integer BEFORE_POSITION = 1;

    public LinkedList(Object data) {
        this.head = new Node(data);
        this.length = 0;
    }

    public void addAtEnd(Object data) {
        Node navigator = this.head;

        while (navigator.getNext() != null) {
            navigator = navigator.getNext();
        }

        navigator.setNext(new Node(data));

        this.length++;
    }

    public void addAtPos(Object data, Integer position) {
        Node cursor = this.head;
        Node holder = null;
        Node newNode = new Node(data);
        Integer index = 1;

        if (position > this.length) {
            throw new Error("[-] addAtPos : Given position is invalid.");
        }

        if (this.length == 0) {
            throw new Error("[-] addAtPos : Impossible to delete node at this pos, list is empty.");
        }

        while (cursor.getNext() != null && position != index) {
            cursor = cursor.getNext();
            index++;
        }

        if (index == position) {
            holder = cursor.getNext();

            cursor.setNext(newNode);

            newNode.setNext(holder);
            length++;

            if (index == 0) {
                this.head = cursor;
            }
        }
    }

    public void addAtHead(Object data) {
        Node newHead = new Node(data);

        newHead.setNext(this.head);
        this.head = newHead;
        this.length++;
    }

    public Node getNodeAtPos(Integer position) {
        Node cursor = this.head;
        Integer index = 1;

        if (position > this.length) {
            throw new Error("[-] getNodeAtPos : Given position is invalid.");
        }

        while (cursor.getNext() != null && index != position) {
            cursor = cursor.getNext();
            index++;
        }

        if (index == position) {
            return cursor;
        }

        return null;
    }

    public Node getNodeByValue(Object value) {
        Node cursor = this.head;

        while (cursor.getNext() != null) {
            if (cursor.getData() == value) {
                return cursor;
            }
            cursor = cursor.getNext();
        }
        return null;
    }

    public void deleteAtPos(Integer position) {
        Node cursor = this.head;
        Integer index = 1;

        if (position > this.length) {
            throw new Error("[-] deleteAtPos : Given position is invalid.");
        }

        if (this.length == 0) {
            throw new Error("[-] deleteAtPos : Impossible to delete node at this pos, list is empty.");
        }

        while (index < position - BEFORE_POSITION) {
            cursor = cursor.getNext();
            index++;
        }

        if (index == 1) {
            this.head = this.head.getNext();
            this.length--;
        }

        else if (index == position - BEFORE_POSITION) {
            cursor.setNext(cursor.getNext().getNext());
            this.length--;
        }

        else {
            throw new Error("[-] deleteAtPos : Node not found.");
        }
    }

    public void deleteByValue(Object data) {
        Node cursor = this.head;

        if (this.length == 0) {
            throw new Error("[-] deleteByValue : Impossible to delete node by value, list is empty.");
        }

        if (data == null) {
            throw new Error("[-] deleteByValue : Data is empty.");
        }

        if (this.head.getData() == data) {
            this.head = this.head.getNext();
            this.length--;
            return ;
        }

        while (cursor.getNext() != null && cursor.getNext().getData() != data) {
            cursor = cursor.getNext();
        }

        if (cursor.getNext().getData() == data) {
            cursor.setNext(cursor.getNext().getNext());
            this.length--;
        }

        else {
            throw new Error("[-] deleteByValue : Node not found.");
        }
    }

    public void printList() {
        Node cursor = this.head;

        while (cursor != null)
        {
            System.out.println(cursor.getData());
            cursor = cursor.getNext();
        }
    }

    public Integer getLength() {
        return this.length;
    }
}
