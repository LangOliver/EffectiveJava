package com.learn.java;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).calories(100).fat(0).build();
        System.out.println(cocaCola.toString());
    }
}
