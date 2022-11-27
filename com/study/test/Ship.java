package com.study.test;



import java.util.Arrays;
import java.util.Scanner;

public class Ship {
    private int fieldSize; // Розмір поля
    public int shipLength; // Розмір корабля
    public int[] rndShip;
    public void ship() {
        int z = getFieldSize() - getShipLength();
        int rnd = (int)(1 + Math.random()*(z+1));
        int[] rndShip = new int[getShipLength()];
        for (int i = 0; i<rndShip.length;i++){
            rndShip[i] = rnd++;
        }
        System.out.println(Arrays.toString(rndShip));

        int sizeS = 0;
        int[] arrayShip = rndShip;
        while (sizeS < getShipLength()){
            int tmp = -1;
            System.out.println("choose");
            Scanner nextHit = new Scanner(System.in);
            int nHit = nextHit.nextInt();
            for (int i =0; i< arrayShip.length; i++){
                if ((nHit == arrayShip[i])){
                    sizeS++;
                    arrayShip[i] = -1;
                    System.out.println("You hit");
                    tmp = sizeS;
                }
                if (sizeS == getShipLength()){
                    System.out.println("You Win");
                }

            } if(sizeS != tmp){
                System.out.println("miss");
            }
            if (nHit < 1 || nHit > getFieldSize()){
                System.out.println("Choose your number from 1 to " + getFieldSize());
            }
        }
    }

    public int getShipLength() {return shipLength;}
    public int getFieldSize() {return fieldSize;}
    public int[] getRndShip() {return rndShip;}
    public void setRndShip(int[] rnd) {this.rndShip = rndShip;}

    public void setShipLength(int shipLength) {
        if(shipLength>0 & shipLength<=100) {
            this.shipLength = shipLength;
        } else {
            System.out.println("Ведіть число від 1 до 100");
        }
    }
    public void setFieldSize(int fieldSize) {
        if(fieldSize>0 & fieldSize<=100) {
            this.fieldSize = fieldSize;
        } else {
            System.out.println("Ведіть число від 1 до 100");
        }
    }

}

