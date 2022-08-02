package APracticeL4;

public class CircularLinkedList {  

    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
   
    public Node head = null;  
    public Node tail = null;  
  
  
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {              
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {              
            tail.next = newNode;             
            tail = newNode;   
            tail.next = head;  
        }  
    }
    public void Sort_List()
    {
        Node current = head;

        Node temp = null;

        int value;

        if (head == null) {
            System.out.println("Your list is empty");
        }
        else {
            while (current.next != head) {
                temp = current.next;
                while (temp != head) {
                    if (current.data > temp.data) {
                        value = current.data;
                        current.data = temp.data;
                        temp.data = value;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
        CircularLinkedList cll = new CircularLinkedList();  
        cll.add(10);  
        cll.add(2);  
        cll.add(3);  
        cll.add(40);
        cll.Sort_List();
        cll.display();  
    }  
}  