package com.study.test;

import java.util.Scanner;

public class ShipsOfWar  {


     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Ship ship = new Ship(scanner);
         ship.fight();
     }
}




