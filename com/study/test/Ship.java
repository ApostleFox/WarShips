package com.study.test;

import java.util.Arrays;
import java.util.Scanner;

public class Ship {
    private int fieldLength;
    private int shipLength;
    private final Scanner scanner;
    public Ship(Scanner scanner) {
        this.scanner = scanner;
    }
    public int readShot(){
        while (true){
            int value = scanner.nextInt();
            if (0<value && value<=fieldLength){
                return value; } else {
                System.out.println("Write a number from 1 to " + fieldLength);
            }
        }
    }
    public int readFieldLength(){
        while (true){
            int value = scanner.nextInt();
            if (0<value && value<=100){
                return value;} else {
                System.out.println("Write a number from 1 to 100");
            }
        }
    }

    public int readShipLength(){
        while (true){
            int value = scanner.nextInt();
            if (0<value && value<= fieldLength){
                return value;} else {
                System.out.println("Write a number from 1 to " + fieldLength);
            }
        }
    }

    public void fight(){
        System.out.println("Write a length Field");
        fieldLength = readFieldLength();
        System.out.println("Write a length Ship");
        shipLength = readShipLength();
        int differenceSize = fieldLength - shipLength;
        int rnd = (int)(1 + Math.random()*(differenceSize + 1));
        int[] arrayShip = new int[shipLength];
        for (int i = 0; i<arrayShip.length;i++){
            arrayShip[i] = rnd++;
        }
        System.out.println(Arrays.toString(arrayShip));
        int sizeS = 0;
        while (sizeS < shipLength){
            int tmp = -1;
            System.out.println("Shot");
            int nHit = readShot();
            for (int i = 0; i< arrayShip.length; i++){
                if (nHit == arrayShip[i]){
                    sizeS++;
                    arrayShip[i] = -1;
                    System.out.println("You Hit");
                    tmp = sizeS;
                }
                if (sizeS == shipLength){
                    System.out.println("YOU WIN");
                    break;
                }
            }
            if (tmp != sizeS){
                System.out.println("You Miss");
            }
        }
    }
}