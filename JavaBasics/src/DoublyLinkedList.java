public class DoublyLinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static DoublyLinkedList insertAtBeginning(DoublyLinkedList list, int data) {
        Node node = new Node(data);
        Node head = list.head;
        if (list.head == null) {
            list.head = node;
            list.tail = node;
        } else {
            node.next = head;
            head.prev = node;
            list.head = node;
        }
        return list;
    }

    static DoublyLinkedList insertEnd(DoublyLinkedList list, int data) {
        Node node = new Node(data);
        Node tail = list.tail;
        if (list.tail == null) {
            list.head = node;
            list.tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            list.tail = node;
        }
        return list;
    }

    public static void insertAtPosition(DoublyLinkedList list, int data, int pos) {
        Node curr = list.head;
        Node prev = null;
        Node next = null;
        int index = 1;
        Node temp = new Node(data);
        if (pos == 0) {
            insertAtBeginning(list, data);
        } else {
            while (index < pos && curr.next != null) {
                curr = curr.next;
                index++;
            }
            if (curr.next == null) {
                insertEnd(list, data);
            } else {
                temp.next = curr.next;
                temp.prev = curr;
                curr.next.prev = temp;
                curr.next = temp;
                //curr.prev.next = temp;
            }
        }
    }

    static void display(DoublyLinkedList list){
        Node current = list.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    static void deleteAtBegining(DoublyLinkedList list){
        if(list.head == null){
            return;
        }
        if(list.head == list.tail){
            list.head = null;
            list.tail = null;
            return;
        }

        Node temp = list.head;
        list.head = temp.next;
        list.head.prev= null;
        temp = null;

    }

    static void deleteAtEnd(DoublyLinkedList list){
        if(list.head == null){
            return;
        }
        if(list.head == list.tail){
            list.head = null;
            list.tail = null;
            return;
        }

        Node temp = list.tail;
        list.tail = temp.prev;
        list.tail.next= null;
        temp = null;

    }

    static void deleteAtSpecificPosition(DoublyLinkedList list, int pos) {
        if(pos == 0){
            deleteAtBegining(list);
            return;
        }
        Node curr = list.head;
        int index = 0;
        while(index != pos && curr != null){
            curr = curr.next;
            index++;
        }
        if(curr == list.tail){
            deleteAtEnd(list);
            return;
        }
        if(curr == null) {
            System.out.println("No data");
            return;
        }
        Node temp = curr;
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        temp.prev = null;
        temp.next = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList = insertAtBeginning(doublyLinkedList, 1);
        doublyLinkedList = insertAtBeginning(doublyLinkedList, 13);
        doublyLinkedList = insertEnd(doublyLinkedList, 24);

        display(doublyLinkedList);
        System.out.println("\n AFTER");
        insertAtPosition(doublyLinkedList, 123, 0);

        display(doublyLinkedList);
        deleteAtSpecificPosition(doublyLinkedList, 4);
        System.out.println("\n AFTER 2 TEST");
        display(doublyLinkedList);
    }

}
