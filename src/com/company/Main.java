package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        LinkedList<String> linkedList= new LinkedList<>();
//        linkedList.add("Sally");
//        linkedList.add("Becky");
//        linkedList.add("Nick");
//        linkedList.add("Jack");
//        linkedList.add("Rachel");
//        System.out.println(linkedList.contains("Sally"));
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.indexOf("Jack"));
//        System.out.println(linkedList.lastIndexOf("Sally"));
//        linkedList.removeFirst();
//        for(String item: linkedList)
//        {
//            System.out.print(item+" -> ");
//        }

        CustomLinkedList linkedList= new CustomLinkedList();
        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourhNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next= secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourhNode;
        linkedList.displayContent();



    }
}
