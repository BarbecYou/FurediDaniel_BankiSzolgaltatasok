package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    public static final double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){
        if (osszeg > super.aktualisEgyenleg){
            return false;
        }
        super.aktualisEgyenleg -= osszeg;
        return true;
    }
    public void kamatJovairas(){
        this.aktualisEgyenleg = (int) (this.aktualisEgyenleg * this.kamat);
        //super.aktualisEgyenleg *= this.kamat;
        //TODO: teszteles
    }
}
