import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public final void AddNode() {
        LinkedList test = new LinkedList(10);

        assertEquals(1, test.getLength());
        test.addAtHead(1);
        assertEquals(2, test.getLength());
    }

}
