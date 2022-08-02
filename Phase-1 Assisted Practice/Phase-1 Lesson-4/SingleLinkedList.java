package APracticeL4;

public class SingleLinkedList {    
    class Node{    
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
        
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
    public void display() {    
     
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
           
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    } 
    void deleteNode(int key)
    {
       
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next; 
            return;
        }
 
        while (temp != null && temp.data != key) 
        {
            prev = temp;
            temp = temp.next;
        }
 
        if (temp == null)
        {
            return;
        }
        prev.next = temp.next;
    }
        
    public static void main(String[] args) {    
            
        SingleLinkedList sList = new SingleLinkedList();    
  
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);
        sList.display();  
        sList.deleteNode(3);
        sList.display();    
    }    
}    