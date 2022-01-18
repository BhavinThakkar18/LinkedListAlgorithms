package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Sally");
        linkedList.add("Becky");
        linkedList.add("Nick");
        linkedList.add("Jack");
        linkedList.add("Rachel");
        System.out.println(linkedList.contains("Sally"));
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf("Jack"));
        System.out.println(linkedList.lastIndexOf("Sally"));
        linkedList.removeFirst();
        for(String item: linkedList)
        {
            System.out.print(item+" -> ");
        }

    }
}
