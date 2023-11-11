public class LinkedList {
    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////
    
    private Node head;
    private Node tail;
    private int length;
    
    class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    
    
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
    
    public void getLength() {
        System.out.println("Length: " + length);
    }
    
    // WRITE APPEND METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    
    // WRITE REMOVELAST METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public Node removeLast() {
        // Case 1: Empty LinkedList
        if (length == 0) return null;
        
        // Case 2: Not Empty LinkedList
        // Step 1: loop through entire of list until the end is null
        Node temp = head; // flag to loop entire of list
        Node pre = head; // variable for keeping value of temp
        while(temp.next != null) {
            pre = temp; // keeping temp value
            temp = temp.next; // set temp value = next node
        }
        // Step 2: stop looping at the last node. And removing the last node by setting tail value = prev node
        tail = pre; // set tail value == prev node
        tail.next = null; // set linked value of the last node = null
        length--; // decrease length of list
        
        // Case 3: LinkedList has only 1 element
        if (length == 0) { // in case list length = 1. removing node will be return head & tail = null
            head = null;
            tail = null;
        }
        
        return temp; // value of the removed node
    }
    
}
