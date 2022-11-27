package com.study.test;

import java.util.Scanner;



public class ShipsOfWar  {
    Ship ship = new Ship();
    private static int readShipLength(Scanner scan) {
        while (true) {
            int value = scan.nextInt();
            if (value > 0 & value <= 100) {
                return value;

            } else {
                System.out.println("Write a number from 1 to 100");
            }
        }
    }

    private static int readFieldLength(Scanner scan) {
        while (true) {
            int value = scan.nextInt();
            if (value > 0 & value <= 100) {
                return value;

            } else {
                System.out.println("Write a number from 1 to 100");
            }
        }
    }


     public static void main(String[] args) {
         Ship ship = new Ship();

         System.out.println("Ведіть розмір поля");
         readFieldLength(new Scanner(System.in));
         ship.setShipLength(readFieldLength(new Scanner(System.in)));

         System.out.println("Ведіть розмір корабля");
         readShipLength(new Scanner(System.in));
         ship.setShipLength(readShipLength(new Scanner(System.in)));


         ship.ship();

        }




}




