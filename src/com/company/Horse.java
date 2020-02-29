package com.company;

public class Horse extends Habitat implements Printable{
    private int speedRun;

    public Horse(String name, String place, int speedRun) {
        super(name, place);
        this.speedRun = speedRun;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    @Override
    public void print() {
        System.out.println("The horse speed run: " + getSpeedRun() + " km/h");
        System.out.println("The horse name: " + getName());
    }
}
