class LinkedList {
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static Node head;

    public static void main(String[] args) {

    }
    
    public static void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }

        node.next = head;
        head = node;
    }

    public static void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            
        }
    }

    public static void zigZag(Node head) {
        //Finding Mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow;

        //Reverse LinkedList
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Alt Merge
        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;

        }

    }
}