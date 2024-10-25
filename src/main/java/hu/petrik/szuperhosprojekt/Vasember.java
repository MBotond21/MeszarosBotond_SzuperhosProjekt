package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{

    private Random rand = new Random();

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        setSzuperero(getSzuperero() + rand.nextFloat(11));
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
