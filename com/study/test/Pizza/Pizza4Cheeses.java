package com.study.test.Pizza;

public class Pizza4Cheeses extends Pizza implements Printable{
    @Override
    public void cheese() {
        System.out.println("Dor Bleu");
        System.out.println("Mozzarella");
        System.out.println("Parmesan");
        System.out.println("Cheddar");
    }

    @Override
    public void sauce() {
        System.out.println("Cream sauce");
    }
    @Override
    public void print() {
        dough();
        sauce();
        cheese();
    }
}
