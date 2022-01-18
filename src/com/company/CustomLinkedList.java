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

}
