package com.company;

import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
//0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
//Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.


        Random random = new Random();
        int[] array = new int[10];
        ArrayList<Integer> number1 = new ArrayList<>();
        LinkedList<Integer> number2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(0, 2);
            number1.add(random.nextInt(0, 2));
            number2.add(random.nextInt(0, 2));
        }

        System.out.print("Massiv: ");
        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.print("\nArrayList: ");
        for (int a : number1) {
            System.out.print(a + " ");
        }
        System.out.print("\nLinkedList: ");
        for (int a : number2) {
            System.out.print(a + " ");
        }
        System.out.println();
        method(array);
        method(number1);

        method(number2);

    }

    public static void method(int[] a) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void method(ArrayList<Integer> a) {
       ArrayList<Integer> aaa = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            aaa.add(a.get(i));
            Collections.sort(aaa);
        }
        System.out.println(aaa
        );
    }

    public static void method(LinkedList<Integer> b) {
        LinkedList<Integer> bbb = new LinkedList<>();
        for (int i = 0; i < b.size(); i++) {
            bbb.add(b.get(i));
            Collections.sort(bbb);
        }
        System.out.println(bbb);
    }


}
