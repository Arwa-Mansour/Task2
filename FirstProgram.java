/*
Describe in detail an algorithm for reversing
a singly linked list L using only a constant amount of additional space.
 */
public class FirstProgram {

    static class LinkedList {
        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        Node reverse(Node node)
        {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args)
        {
            LinkedList list = new LinkedList();
            list.head = new Node(10);
            list.head.next = new Node(20);
            list.head.next.next = new Node(30);
            list.head.next.next.next = new Node(40);

            System.out.println("Given Linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }
    }

}


