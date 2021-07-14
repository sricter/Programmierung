package com.company;

public class BubbleSort {
    private int[] liste = {5,1,4,9,0,8,6};

    public int[] sortieren() {
        int a;
        for (int i = 0; i < liste.length - 1; i++) {
            if (liste[i] < liste[i + 1]) {
                continue;
            }
            a = liste[i];
            liste[i] = liste[i + 1];
            liste[i + 1] = a;
            sortieren();
        }
        return liste;
    }



    public static void main(String[] args) {
       BubbleSort bs = new BubbleSort();
       int[] arr = bs.sortieren();
       for (int i = 0; i< arr.length; i++){
           System.out.println(i+1 + ": " + arr[i]);
       }

    }

}
