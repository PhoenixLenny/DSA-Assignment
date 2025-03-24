public class SinglyLinkedList {

    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Helper method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.printList(); // Output: 1 2 3

        list.insertAtBeginning(0);
        list.printList(); // Output: 0 1 2 3

        list.deleteFromBeginning();
        list.printList(); // Output: 1 2 3

        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.printList();//output:
        list.deleteFromBeginning();
        list.printList();//output:

    }
}