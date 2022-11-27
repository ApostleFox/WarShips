package com.study.test.Pizza;
import java.util.Scanner;
public class PizzaDemo {
    HawaiianPizza hawaiianPizza = new HawaiianPizza();
    Pizza4Cheeses pizza4Cheeses = new Pizza4Cheeses();
    FoughtMeat foughtMeat = new FoughtMeat();

    private final Scanner scanner;
    public PizzaDemo(Scanner scanner) {
        this.scanner = scanner;
    }
    public int readMenu(){
        while (true){
            int value = scanner.nextInt();
            if (0<value && value<=3){
                return value; } else {
                System.out.println("Write a number from 1 to 3" );
            }
        }
    }

    public void makeChoice(){
        System.out.println("Menu :");
        System.out.println("1. Hawaiian pizza");
        System.out.println("2. Fought cheeses pizza");
        System.out.println("3. Fought meat");
        System.out.println("Choose your pizza");
        int number = readMenu();
        if (number == 1){
            hawaiianPizza.print();
        }
        if (number == 2){
            pizza4Cheeses.print();
        }
        if (number == 3){
            foughtMeat.print();
        }
    }
}
