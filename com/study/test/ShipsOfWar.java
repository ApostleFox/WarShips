package com.study.test;

import java.util.Scanner;

public class ShipsOfWar  {
    private static int readFieldLength(Scanner scan){
        while (true){
            int value = scan.nextInt();
            if (0<value & value<=100){
                return value; } else {
                System.out.println("Write a number from 1 to 100");
                }
            }
        }

    private static int readShipLength(Scanner scan){
        while (true){
            int value2 = scan.nextInt();
            if (0<value2 & value2<=100){
                return value2; } else {
                System.out.println("Write a number from 1 to 100");
            }
        }
    }

     public static void main(String[] args) {
         Ship ship = new Ship();

         System.out.println("Write a length of Field");
         ship.setFieldLength(readFieldLength(new Scanner(System.in)));

         System.out.println("Write a length of Ship");
         ship.setShipLength(readShipLength(new Scanner(System.in)));
         ship.fight();
        }
}




