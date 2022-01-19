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
}
