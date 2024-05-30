public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList linkedList, int data){
        Node node = new Node(data);
        if(linkedList.head == null){
            linkedList.head = node;
            return linkedList;
        }
        Node currentNode = linkedList.head;
        while(currentNode.next  != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return linkedList;
    }

    public static void printLinkedList(LinkedList list){
        if(list.head == null){
            System.out.println("Linked List is empty");
            return;
        }else {
            Node currentNode = list.head;
            while(currentNode !=null){
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

    public static LinkedList deletionByKey(LinkedList list, int dataToDelete){
        Node currNode = list.head;
        Node prev = null;
        if(currNode!=null && currNode.data == dataToDelete){
            list.head = currNode.next;
            return list;
        }

        while(currNode!=null && currNode.data != dataToDelete){
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null){
            prev.next = currNode.next;
        }

        if(currNode == null){
            System.out.println("Data not found");
        }
        return list;
    }

    public static LinkedList deletionByPosition(LinkedList list, int pos){

        int index = 0;
        Node curr = list.head;
        Node prev = null;
        if(pos == 0 && curr != null){
            list.head = curr.next;
            return list;
        }

        while(pos != index && curr !=null){
            prev = curr;
            curr = curr.next;
            index++;
        }

        if(curr != null){
            prev.next = curr.next;
        }else{
            System.out.println("Data Not found");
        }

        return list;

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        printLinkedList(linkedList);
        linkedList = insert(linkedList, 1);
        linkedList = insert(linkedList, 2);
        linkedList = insert(linkedList, 3);
        linkedList = insert(linkedList, 4);
        printLinkedList(linkedList);
        //deletionByKey(linkedList, 5);
        deletionByPosition(linkedList, 5);
        System.out.println("\n" + "After deletion");
        printLinkedList(linkedList);

    }
}
