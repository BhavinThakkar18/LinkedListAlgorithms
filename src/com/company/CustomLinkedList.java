package com.company;

public class CustomLinkedList {
    Node head;
    public void displayContent()
    {
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }
    public int sizeOfList()
    {
        int k=0;
        Node current = head;
        if(head==null)
        {
            return 0;
        }
        else if(head.next==null)
        {
            return 1;
        }
        while (current!=null)
        {
           k++;
           current=current.next;
        }
        return k;
    }
    public void deleteBackHalf(){
        Node slow= head;
        Node fast= head;
        Node prev= null;
        if(head==null || head.next==null)
        {
            head=null;
        }
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
    }

    public void deleteKthElement(int k)
    {
        Node slow= head;
        Node fast= head.next;
        Node prev= null;
        int iteration=sizeOfList()-k;
        if(sizeOfList()==0 ||sizeOfList()==1)
        {
            head=null;
        }
        if(iteration<0)
        {
            System.out.println("Invalid Choice of K= "+iteration+" which is <0");
            return;
        }
        else if(iteration==0)
        {

            head=fast;
            slow.next=null;

            return;
        }
        while((iteration-1)!=0)
        {
            fast=fast.next;
            slow=slow.next;
            iteration--;
        }
        prev=slow;
        slow= fast;
        fast=fast.next;
        prev.next=fast;
        slow.next=null;

    }
}
