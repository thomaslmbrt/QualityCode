public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkedList test = new LinkedList();

        test.addAtHead(2);
        test.addAtHead(1);
        test.addAtQueue(4);
        test.addAtPosition(3, 3);


        System.out.println("-----TEST---------");
        System.out.println(test.getAtPosition(1));
        System.out.println(test.getAtPosition(2));
        System.out.println(test.getAtPosition(3));
        System.out.println(test.getAtPosition(4));

        System.out.println(test.getLength());
    }
}
