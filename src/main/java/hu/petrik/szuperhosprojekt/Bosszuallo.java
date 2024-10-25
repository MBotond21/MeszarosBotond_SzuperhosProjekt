package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if(szuperhos instanceof Bosszuallo) {
            return szuperhos.mekkoraAzEreje() < szuperero && ((Bosszuallo) szuperhos).isVanEGyengesege();
        }
        else if(szuperhos instanceof Batman){
            return szuperhos.mekkoraAzEreje() <= szuperero/2;
        }
        return false;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Szupererő: {0};", szuperero) + (vanEGyengesege? " van gyengesége": " nincs gyengesége");
    }
}
