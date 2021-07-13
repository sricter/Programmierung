package Progr2;

public class Konto {
    private String inhaber;
    private String iban;
    private float saldo;
    private static int counter;


    public Konto(){
        counter++;
        iban= "DE 47" +counter;
    }
    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getIBAN() {
        return iban;
    }

    public void setIBAN(String iban) {
        this.iban = iban;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
