package com.seyf.javabasics;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(5 * 2);

        // Variables

        int age = 20;
        System.out.println(10 * age);
        System.out.println(age / 5);

        int x = 2;
        int y = 11;
        System.out.println(y / x);
        System.out.println(y%x);

        // Doube - Float

        double z = 5.1;
        double a = 12.0;
        System.out.println(a / z);

        // Long

        long myLong = 54;
        System.out.println(myLong/5);

        // Float

        float myFloat = 47.0f;
        System.out.println(myFloat/4);

        double pi = 3.14;
        int r = 5;
        System.out.println("Dairenin Alanı = " + pi * r * r);
        System.out.println("Dairenin Çevresi = " + 2 * pi * r);

        // String
        String name = "James";
        String surname = "Hovard";
        System.out.println(name + " " + surname);
        String fullname = name + " " + surname;
        System.out.println(fullname);

        // Boolean

        boolean isDead = true;
        System.out.println(isDead);
        isDead = false;
        System.out.println(isDead);

        // Final

        final int myInteger = 5;
        System.out.println(myInteger);
        //myInteger = 4;
        System.out.println(myInteger);

    }
}
