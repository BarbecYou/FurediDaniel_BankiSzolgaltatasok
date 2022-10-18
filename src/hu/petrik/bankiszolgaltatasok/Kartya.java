package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas{

    public Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg){
        if (this.szamla.kivesz(osszeg)){
            return true;
        }
        return false;
    }
}
