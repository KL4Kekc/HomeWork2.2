package com.company;

public class Ilbirs extends Habitat implements Printable{
    private int jumpHeight;

    public Ilbirs(String name, String place, int jumpHeight) {
        super(name, place);
        this.jumpHeight = jumpHeight;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void print(){
        System.out.println("The jump height of Ilbirs: " + jumpHeight + " meters");
        System.out.println("The Ilbrs name: " + getName());
    }
}
