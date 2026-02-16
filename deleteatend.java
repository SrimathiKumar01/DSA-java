  import java.util.Scanner;

public class DeleteatEnd {
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

 public void DAE(){


    Node temp = head;

    while(temp.next != null){
        temp = temp.next;
    }

    temp.prev.next = null;
    tail = temp.prev;
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

     DeleteatEnd  d=new DeleteatEnd();
        while (true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }   
            else{
                d.IAE(n);
            }
            
        }
         d.DAE();
        d.display();
    }

    
}
