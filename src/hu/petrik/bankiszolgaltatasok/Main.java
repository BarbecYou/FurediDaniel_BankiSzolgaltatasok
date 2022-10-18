package hu.petrik.bankiszolgaltatasok;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Füredi Dániel");
        Bank b1 = new Bank();
        b1.szamlanyitas(t1, 1);
        b1.szamlanyitas(t1, 5);
        b1.szamlanyitas(t1, 0);

        System.out.println(b1.getOsszHitelkeret());

        HitelSzamla h1 = new HitelSzamla(t1, 1000);
        h1.befizet(5000);
        Kartya temp = h1.ujKartya("1106");
        System.out.println(temp.vasarlas(6000));


    }
}
