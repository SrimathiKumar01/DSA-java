 import java.util.Scanner;

public class DeleteatBegin {
    Node head,tail;
     class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
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
            n.prev=tail;
            tail=n;
        }
    }
public void DAB(){
       head=head.next;
       head.prev.next=null;
       head.prev=null;
}
public void display(){
        Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
           
        }

       
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     DeleteatBegin  d=new DeleteatBegin();
        while (true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }   
            else{
                d.IAE(n);
            }
            
        }
         d.DAB();
        d.display();
    }

    
}
