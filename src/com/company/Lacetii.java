package com.company;

public class Lacetii extends Machin {
    public Lacetii(int speed) {
        super(speed);
    }

    @Override
    public void started() {
        System.out.println("Врумммм");
    }
}
