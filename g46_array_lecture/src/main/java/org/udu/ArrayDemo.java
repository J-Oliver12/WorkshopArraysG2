package org.udu;

public class ArrayDemo {

    public static void main(String[] args) {
        String [] stringArrays= new String[3];
        int[] numbers = new int [] {2, 4, 6, 8};
        char[] letters = {'J', 'A', 'V', 'A'};

        ex1();

    }

    public static void ex1(){
        String[] names = new String [3];
        System.out.println(names.length);
        System.out.println("----------------");
        names[0] = "Fredrik";
        names[2] = "Jonas";
//   ==names[names.length -1 ] = "Jonas";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }

}
