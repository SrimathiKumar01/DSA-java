import java.util.*;
public class IAE {
    Node head,tail;
    public class Node{
        int data;
        Node next;
    Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insert(int data){
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IAE m=new IAE();
        while (true) 
        { 
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            else{
                m.insert(n);
            }
        }
        m.display();
    }

    }
