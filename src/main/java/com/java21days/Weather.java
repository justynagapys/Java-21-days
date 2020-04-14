package com.java21days;

public class Weather{
    public static void main(String[] arguments){
        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ...");
        //Aby skonwertować temperaturę ze stopni Fahrenheita na stopnie Celsujsza,
        //rozpocznij od odjęcia 32.
        fah = fah-32;
        //Podziel wynik przez 9.
        fah = fah/9;
        //Pomnóż wynik przez 5.
        fah = fah*5;
        System.out.println(fah + " stopni Celsjusza\n");
        
        float cel =33;
        System.out.println(cel + " stopnie Celsujsza to ...");
        //Aby skonwertować temperaturę ze stopni Celsjusza na stopnie Fahrenheita,
        //rozpocznij od pomnożenia przez 9.
        cel = cel*9;
        //Podziel odpowiedź przez 5.
        cel = cel/5;
        //Dodaj do odpowiedzi 32.
        cel = cel+32;
        System.out.println(cel + " stopni Fahrenheita");
    }
}