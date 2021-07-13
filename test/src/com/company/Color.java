package com.company;

import org.w3c.dom.css.RGBColor;

public class Color {

        String color = "Blue";
        String color2 = "Green";
        String all = "RGB";

    public String getAll() {
        return all;
    }

    public String getColor() {
        return color;
    }

    public String getColor2() {
        return color2;
    }

    public void printStar()
    {
        System.out.println("***************");
    }
    public void rgb()
    {
        printStar();
        System.out.println("Die Farbe ist: "+ all);
        printStar();
    }

    public void blau()
    {
        printStar();
        System.out.println("Die Farbe ist: "+ color);
        printStar();
    }
}
