package com.study.test.Pizza;

public class FoughtMeat extends Pizza implements Printable{

    void othersMeats(){
        System.out.println("Ham");
        System.out.println("Bavarian sausages");
        System.out.println("Beef");
    }
    @Override
    public void print() {
        dough();
        sauce();
        cheese();
        chicken();
        othersMeats();
    }
}
