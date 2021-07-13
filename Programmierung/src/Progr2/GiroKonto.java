package Progr2;

public class GiroKonto extends Konto{
    private int pin;
    private float sollZinsSatz;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public float getSollZinsSatz() {
        return sollZinsSatz;
    }

    public void setSollZinsSatz(float sollZinsSatz) {
        this.sollZinsSatz = sollZinsSatz;
    }

    public static void main(String[] args){
        GiroKonto firstGiro = new GiroKonto();
        System.out.println("IBAN = " + firstGiro.getIBAN());

    }

}
