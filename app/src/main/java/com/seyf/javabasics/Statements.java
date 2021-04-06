package com.seyf.javabasics;

public class Statements {
    public static void main(String[] args) {

        // Statements

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);
        x = 5;
        int y = 4;
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x>=y);
        y = 5;
        System.out.println(x==y);
        System.out.println(x!=y);

        // and &&
        // or ||

        x=3;
        y=4;
        int z = 5;
        System.out.println(x<y && y<z);
        System.out.println(x<y && y>z);
        System.out.println(x<y || y>z);
        System.out.println(x>y || y>z);

        // if statements

        if (x<y){
            System.out.println("X Küçüktür Y'den");
        }else if (x==y){
            System.out.println("X Eşittir Y'ye");
        }else{
            System.out.println("X Büyüktür Y'den");
        }

        // Switch

        int day = 2;
        String dayString = "";
        if (day==1){
            dayString = "Monday";
        }else if (day!=1){
            dayString = "Today is not Monday";
        }
        System.out.println(dayString);

        day = 3;
        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednsday";
                break;
            default:
                    dayString = "Sunday";
        }
        System.out.println(dayString);

    }
}