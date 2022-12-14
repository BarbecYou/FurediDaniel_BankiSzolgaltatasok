package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista;

    public Bank() {
        szamlaLista = new ArrayList<>();
    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        Szamla tempSzamla = hitelKeret == 0 ? new MegtakaritasiSzamla(tulajdonos) : new HitelSzamla(tulajdonos, hitelKeret);
        this.szamlaLista.add(tempSzamla);
        return tempSzamla;
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (Szamla sz : szamlaLista){
            if (sz.getTulajdonos() == tulajdonos){
                ossz += sz.getAktualisEgyenleg();
            }
        }
        return ossz;
    }
    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla tempSzamla = new MegtakaritasiSzamla(tulajdonos);
        for (Szamla sz : szamlaLista){
            if (sz.getAktualisEgyenleg() > tempSzamla.getAktualisEgyenleg() && sz.getTulajdonos() == tulajdonos){
                tempSzamla = sz;
            }
        }
        return tempSzamla;
    }
    public long getOsszHitelkeret(){
        long osszHitelKeret = 0;
        for (Szamla sz : szamlaLista){
            if (sz.getClass() == HitelSzamla.class){
                osszHitelKeret += ((HitelSzamla) sz).getHitelKeret();
            }
        }
        return osszHitelKeret;
    }
}
