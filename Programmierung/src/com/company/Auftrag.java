package com.company;

public class Auftrag {
    private int menge;

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public static void main(String agrs[]) {
        Artikel artikel = new Artikel();
        Auftrag menge = new Auftrag();

        artikel.setId(125);
        menge.setMenge(5);


        System.out.println("Bestellter Artikel: " + artikel.getId() + " und Anzahl: " + menge.getMenge());
    }
}
