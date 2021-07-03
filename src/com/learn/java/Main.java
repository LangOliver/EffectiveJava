package com.learn.java;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> myChoicesQ = new PriorityQueue<>();
        myChoicesQ.add(2);
        myChoicesQ.add(3);
        myChoicesQ.add(22222);

        ArrayList<Integer> myChoices = new ArrayList<>();
        myChoices.add(20);
        myChoices.add(30);

	    Chooser<Integer> myChooser = new Chooser<>(myChoices);
        System.out.println(myChooser.choose());

        Chooser<Integer> myChooser2 = new Chooser<>(myChoicesQ);
        System.out.println(myChooser2.choose());

    }
}
