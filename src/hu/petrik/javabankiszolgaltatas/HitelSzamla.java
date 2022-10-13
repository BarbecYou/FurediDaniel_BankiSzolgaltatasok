package hu.petrik.javabankiszolgaltatas;

public class HitelSzamla extends Szamla {

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg){
        if (osszeg + hitelKeret < super.aktualisEgyenleg){
            return false;
        }
        super.aktualisEgyenleg -= osszeg;
        return true;
    }
}
