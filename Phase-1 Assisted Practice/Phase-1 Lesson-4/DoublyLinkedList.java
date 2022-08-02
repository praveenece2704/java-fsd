package APracticeL4;

public class DoublyLinkedList {  

    class Node{  
        int data;  
        Node prev;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  

    Node head, tail = null;  

    public void addNode(int data)
    {  
        Node newNode = new Node(data);  

        if(head == null)
        {           
            head = tail = newNode;  
            head.prev = null;  
            tail.next = null;  
        }  
        else 
        {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  

    public void display() 
    {  

        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        
        }  
        System.out.println("Forward Traversel");  
        while(current != null) 
        {  

            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();
    } 
    
    public void backwardtraverse() 
    {  
    	 Node temp = null;
         Node current = head;
         while (current != null) 
         {
             temp = current.prev;
             current.prev = current.next;
             current.next = temp;
             current = current.prev;
         }
   
         if (temp != null) 
         {
             head = temp.prev;
         }
    }
    public void display1() {  
  
        Node current = head;  
        if(head == null)
        {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Backward Traversel"); 
        while(current != null) 
        {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        DoublyLinkedList dl = new DoublyLinkedList();  
        dl.addNode(1);  
        dl.addNode(2);  
        dl.addNode(3);  
        dl.addNode(4);  
        dl.addNode(5);
        dl.display();
        dl.backwardtraverse();
        dl.display1();
    }  
}  