package com.company;

public class Duster extends Machin{
    public Duster(int speed) {
        super(speed);
    }

    @Override
    public void started() {
        System.out.println("тататататата");
    }
}
