package com.company;

public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;
    private double betrag;
    private double zahlung;



    public double getZahlung() {
        return zahlung;
    }

    public void setZahlung(double zahlung) {
        this.zahlung = zahlung;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public void setKapital(double kapital) {
        this.kapital = kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }



    public static void main(String[] args){
        System.out.println("Hello");
        Sparbuch s = new Sparbuch();

        s.setKapital(100);
        s.setKontonummer(123);
        s.setZinssatz(1.5);
        s.setBetrag(10);
        s.setZahlung(5);

        System.out.println("Kontostand beträgt: " + s.kapital + " und Einzahlung: " + s.zahlung);
        System.out.println("Neuer Kontostand beträgt: " + (s.kapital+s.zahlung));

    }
}
