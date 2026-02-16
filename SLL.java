import java.util.*;
public class SLL {
    Node head,tail;
    public class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            next=null;
        }
     }
     public void IAE(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;

        }
        }
        public void IAB(int data){
            Node n=new Node(data);
            n.next=head;
            head=n;
        }
        public void IAP(int pos,int data){
            Node n=new Node(data);
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            
            }
            n.next=temp.next;
            temp.next=n;
    }
    public void DAB(int data){
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void DAE(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
         }
        temp.next=null;
        tail=temp;
    }
    public void DAP(int pos){
        Node temp=head;
        for(int i=0;i<pos-1;i++){
        temp=temp.next;
}  
    Node temp1=temp.next;
temp.next=temp1.next;
temp1.next=null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        SLL m=new SLL();
        Scanner sc=new Scanner(System.in);
        while (true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            } 
            else{
                m.IAE(n);
            }
            
        }
        m.IAB(sc.nextInt());
        m.display();

        m.IAP(sc.nextInt(),sc.nextInt());
        m.display();

        m.DAE();
                m.display();
        m.DAB(sc.nextInt());
        m.display();
        m.DAP(sc.nextInt());
        m.display();
    }
}

