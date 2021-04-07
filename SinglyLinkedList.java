/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public String printValues() {
        String str = "[";
        Node runner = head;
        while (runner.next != null) {
            str += runner.value + ", ";
            runner = runner.next;
        }
        System.out.println(str + runner.value + "]");
        return str + runner.value + "]";
    }

    public String find(int value) {
        Node runner = head;
        while (runner.next != null) {
            if (runner.value == value) {
                return "Found %d".formatted(runner.value);
            }
            runner = runner.next;
        }
        return "%d is not in this SLL".formatted(value);
    }
}