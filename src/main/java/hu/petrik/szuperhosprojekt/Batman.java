package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos{

    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Batman: leleményesség: {0}", lelemenyesseg);
    }
}
