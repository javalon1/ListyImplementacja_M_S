package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {

        public static void main(String[] args) {


            List<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true){
                String linia = scanner.nextLine();

                if (linia.equals("-")){
                    break;
                }
                list.add(linia);
            }
            System.out.println("Lista imion: ");
            for (String el: list){
                System.out.println("Imie: " + el);
            }





    }
}
