package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     //   Box<Integer> box1 = new Box(12);

     //   Box<Float> box2 = new Box(12.32);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(21);
        integerList.add(211);
        integerList.add(21231);

        for (Integer element: integerList){
            System.out.println(element);
        }

        for (int i=0; i<integerList.size(); i++){
            System.out.println(integerList.get(i));
        }

        integerList.remove(3);
        integerList.clear();

        List<String> stringList = new ArrayList<>();
        stringList.add("Zosia");
        stringList.add("Przemek");

        for (String el: stringList){
            System.out.println();
        }



        String napis = "1234654";
        int liczba = Integer.parseInt(napis);


    }
}
