package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        NyTest test = new NyTest("Jan");
        System.out.println(test.getName());

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(i);
        }
        System.out.println(list);

    }

}
