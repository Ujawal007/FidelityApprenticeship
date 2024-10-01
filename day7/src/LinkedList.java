import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        head = tail = null;
        size=0;
    }

    public void addFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
        if(size==0){
            tail = n;
        }
        size++;
    }

    public void addLast(int data){
        Node n = new Node(data);
        if(size==0){
            head = tail = n;
        }
        tail.next = n;
        tail = tail.next;
        size++;
    }

    public void addAt(int data, int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public int getFirst(){
        if(head==null){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public int getLast(){
        if(tail==null){
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public int getAt(int index) throws Exception{
        if(size==0){
            throw new NoSuchElementException();
        }
        else if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            return head.data;
        } else if (index==size-1) {
            return tail.data;
        }
        else {
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void removeFirst(){
        if(head==null){
            throw new NoSuchElementException();
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if(tail==null){
            throw new NoSuchElementException();
        }
        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void removeAt(int index) throws Exception{
        if(size==0){
            throw new NoSuchElementException();
        }
        else if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            removeFirst();
        }
        else if(index==size-1){
            removeLast();
        }
        else {
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }

    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current !=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}
