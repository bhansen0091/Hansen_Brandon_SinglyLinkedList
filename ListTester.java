/**
 * ListTester
 */
public class ListTester {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.add(3);
        sLL.add(4);
        sLL.add(10);
        sLL.add(5);
        sLL.add(15);
        sLL.add(2);
        sLL.printValues();
        sLL.remove();
        sLL.remove();
        sLL.printValues();
        System.out.println(sLL.find(10));
        System.out.println(sLL.find(2));
        
    }
}