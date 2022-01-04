package com.seyf.javabasics;

public class Loops {
    public static void main(String[] args) {

        // For Loop

        int[] myNumbers = {4,5,10,15,20};
        int x = myNumbers[0]/2*3;
        System.out.println(x);

        for (int i=0;i<myNumbers.length;i++){
            System.out.println(myNumbers[i]);
        }

        for (int number:myNumbers){
            System.out.println(number/2*3);
        } // burası önemli

        for (int a = 0; a<10; a++){
            System.out.println(a);
        }

        // While

        int j = 0;
        while(j<10){
            System.out.println("test " + j);
            j++;
        }
    }
}

