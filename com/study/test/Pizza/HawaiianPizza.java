package com.study.test.Pizza;

public class HawaiianPizza extends Pizza implements Printable{
    public void corn(){
        System.out.println("Corn");
    }
    public void pineapple(){
        System.out.println("Pineapple");
    }
    @Override
    public void print() {
        dough();
        sauce();
        chicken();
        pineapple();
        corn();
        cheese();
    }
}
