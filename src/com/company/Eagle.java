package com.company;

public class Eagle extends Habitat implements Printable {
    private int flightAltitude;

    public Eagle(String name, String place, int flightAltitude) {
        super(name, place);
        this.flightAltitude = flightAltitude;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public void print() {
        System.out.println("The eagle flight altitude: " + flightAltitude + " km");
        System.out.println("The eagle name: " + getName());
    }
}
