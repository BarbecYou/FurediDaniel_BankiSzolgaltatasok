package hu.petrik.javabankiszolgaltatas;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Füredi Dániel");
        Bank b1 = new Bank();
        b1.szamlanyitas(t1, 1);
        b1.szamlanyitas(t1, 5);
        b1.szamlanyitas(t1, 0);

        System.out.println(b1.getOsszHitelKeret());
    }
}
