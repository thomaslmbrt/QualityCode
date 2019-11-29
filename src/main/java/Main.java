public class Main {

    public static void main(String [] args)
    {
        LinkedList linkedList = new LinkedList(99);

        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(3);

        linkedList.printList(); // Should display [ 3, 2, 1, 99 ]
        System.out.println("\n\n");

        linkedList.deleteAtPos(2);
        linkedList.printList(); // Should display [ 2, 1, 99 ]
        System.out.println("\n\n");

        linkedList.addAtEnd(4);
        linkedList.addAtEnd(5);
        linkedList.addAtPos(20,3);
        linkedList.addAtPos(30,3);

        linkedList.printList(); // Should display [ 2, 1, 99, 30, 20, 4, 5 ]
        System.out.println("\n\n");

        linkedList.deleteAtPos(1);
        linkedList.deleteAtPos(2);
        linkedList.deleteByValue(30);

        linkedList.printList(); // Should display [ 99, 20, 4, 5]
        System.out.println("\n\n");
    }
}
