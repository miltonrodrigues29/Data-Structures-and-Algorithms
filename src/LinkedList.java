public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }


    }

    public void deleteNode(int index) {

        if (index == 0) {
            System.out.println("Not a valid index");

        }

        if (index == 1) {
            head = head.next;
            System.out.println("Node successfully deleted at index " + index);
            return;

        }

//        1->2->3->4
        Node prevNode = head;
        Node nextNode = head.next;
        for (int i = 0; i < index - 2; i++) {
            prevNode = prevNode.next;
            nextNode = nextNode.next;

        }

        prevNode.next = nextNode.next;
        System.out.println("Node deleted:" + nextNode.data);
//        System.out.println(prevNode.data);
//        System.out.println(nextNode.data);


    }


    public void getNode(int index) {

        if (index == 0) {
            System.out.println("Not a valid index");
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        System.out.println(current.data);

    }

    public void insertAt(int index) {

        Node current = head;

    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is Empty!");
            return;

        }

        System.out.println("Nodes in a singly linked list are:");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;

        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.head);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
        list.getNode(0);
        list.display();
        list.deleteNode(3);
        System.out.println("------------------------------------");
        list.display();

    }


}


