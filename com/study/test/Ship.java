package com.study.test;

import java.util.Arrays;
import java.util.Scanner;

public class Ship {
    private int fieldLength;
    private int shipLength;

    public int readShot(Scanner scan){
        while (true){
            int value = scan.nextInt();
            if (0<value & value<=getFieldLength()){
                return value; } else {
                System.out.println("Write a number from 1 to " + getFieldLength());
            }
        }
    }




    public void fight(){
        int differenceSize = getFieldLength() - getShipLength();
        int rnd = (int)(1 + Math.random()*(differenceSize + 1));
        int[] arrayShip = new int[getShipLength()];
        for (int i = 0; i<arrayShip.length;i++){
            arrayShip[i] = rnd++;
        }
        System.out.println(Arrays.toString(arrayShip));
        int sizeS = 0;
        while (sizeS < getShipLength()){
            int tmp = -1;
            System.out.println("Shot");
            int nHit = readShot(new Scanner(System.in));
            for (int i = 0; i< arrayShip.length; i++){
                if (nHit == arrayShip[i]){
                    sizeS++;
                    arrayShip[i] = -1;
                    System.out.println("You Hit");
                    tmp = sizeS;
                }
                if (sizeS == getShipLength()){
                    System.out.println("YOU WIN");
                }
            }
            if (tmp != sizeS){
                System.out.println("You Miss");
            }
        }


    }

    public int getFieldLength() {return fieldLength;}

    public void setFieldLength(int fieldLength) {
        this.fieldLength = fieldLength;
    }

    public int getShipLength() {return shipLength;}

    public void setShipLength(int shipLength) {
        this.shipLength = shipLength;
    }
}