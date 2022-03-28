package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
            task1();
            task2();
            task3();
            task4();
            task5();
    }

    static void task1() {

        int intVar1 = 20, intVar2 = 10;

        short shortsum = (short) (intVar1 + intVar2);
        System.out.println(shortsum);

        System.out.println(shortsum++);

        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println(byteSum);

        System.out.println(++byteSum);

    }

    static void task2() {

        float number = 13.43f;

        Scanner scanner = new Scanner(System.in);
        //Round down to the closest integer.
        double number_double = number;
        double roundDown = Math.floor(number);
        System.out.println(roundDown);

        int rounded = Math.round(number);
        System.out.println(rounded);

        //Round up to the closest integer.
        double roundUp = Math.ceil(number);
        System.out.println(roundUp);

    }

    static void task3(){

    //--prints the value of Sin 45
    System.out.println(Math.sin(45));

    //--prints the value of cos 45
    System.out.println(Math.cos(45));

    //--prints the value of tan 45
    System.out.println(Math.tan(45));

    //--prints the value of aSin 45
     System.out.println(Math.asin(45));

     //--prints the value of acos 45
      System.out.println(Math.acos(45));

        //--prints the value of atan 45
        System.out.println(Math.atan(45));

        //print the value of atan2 45, any point of choice 55
        System.out.println(Math.atan2(45,55));

        //Algorithms Examples.
        //problem: Print out the numbers from 1 to 5

        //algorithm

        //N = 1
        //n <=5 print n
        //n++

        //For loop
        static void task4(){
            int c=2;
            int d = 10;

            //1. Increment and decrement operators

            System.out.println("Increment of 2: "+ ++c);
            //System.out.println("Increment of 2: "+ c++);
            System.out.println("Decrement of 10: "+ --d);
            //System.out.println("Decrement of 10: "+ d--);

            //2. Bitwise Complement operator
            int e = 35;
            System.out.println("Bitwise Complement operator for 35: "+ ~e);

            //3. Arithmetic operator
            int f =5;
            int g =11;
            System.out.println("Addition of 5 and 11: "+ (f+g));
            System.out.println("Subtraction of 5 and 11: "+ (f-g));
            System.out.println("Multiplication of 5 and 11: " + (f*g));

            //4. Relational operator
            System.out.println("If 100 >= that 35?: "+ (100>=35));
            System.out.println("If 100 is equal to 35?: "+ (100 == 35));

            //5. Bitwise operator
            System.out.println("Right shift for 34: "+ (34>>1));//divides by 2
            System.out.println("Left shift for 34: "+ (34<<2));//multiples by 4

            //6. Conditional operators(&&, ||)
            System.out.println("True and False: "+ (true && false));
            System.out.println("False and False: "+ (false && false));

            System.out.println("True or False: " + (true || false));
            System.out.println("False or False: "+ (false || false));

            //ternary operator(?:)
            int x = 3;
            System.out.println("If x is equal to 3(0 otherwise): "+ ((x==1)?3:0));
            System.out.println("If x is equal to 3(0 otherwise): "+ ((x==3)?3:0));
        }

        static void task5(){
            int distance,hour,min,sec;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your distance in meters: ");
            distance = scanner.nextInt();
            float dist_km = (float) distance/1000;
            float dist_miles = (float) distance/1609;

            System.out.println("Please enter your time taken(only hours): ");
            hour = scanner.nextInt();
            float hours_to_sec =(float) hour*3600;

            System.out.println("Please enter your time taken(only minutes): ");
            min = scanner.nextInt();
            float min_to_hours =(float) min/60;
            float min_to_sec = (float) min*60;

            System.out.println("Please enter your time taken(only seconds): ");
            sec = scanner.nextInt();
            float sec_to_hours = (float) sec/3600;

            float m_s = (float) distance/(hours_to_sec+min_to_sec+sec);
            float km_h = dist_km/(hour+min_to_hours+sec_to_hours);
            float miles_h = dist_miles/((hour+min_to_hours+sec_to_hours));

            System.out.println("Your speed in m/s: "+ m_s);
            System.out.println("Your speed in km/h: "+km_h);
            System.out.println("Your speed in km/h: "+miles_h);

            //loop that prints the value
        }












    }
}
