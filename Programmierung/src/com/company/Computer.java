package com.company;

public class Computer {
    private int cores;
    private String Prozessor;
    private int ram;
    private String Modell;
    private String graphics;


    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getProzessor() {
        return Prozessor;
    }

    public void setProzessor(String prozessor) {
        Prozessor = prozessor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModell() {
        return Modell;
    }

    public void setModell(String modell) {
        Modell = modell;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getInfo(){
        String message= "Rechner hat folgende Merkmale: RAM=" + this.ram + "CPU: "+ this.Prozessor+ " und "+this.cores+ " Kerne.";
        return message;
    }

    public static void main(String[] args){
        Computer myComputer = new Computer();
        myComputer.setCores(8);
        myComputer.setProzessor("Intel Core i7 10th gen.");
        myComputer.setRam(16);
        myComputer.setModell("DELL");
        myComputer.setGraphics("NVIDIA");
        myComputer.getInfo();
        String output = myComputer.getInfo();
        System.out.println(output);
    }


}
