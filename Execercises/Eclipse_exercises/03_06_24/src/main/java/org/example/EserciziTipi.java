package org.example;

public class EserciziTipi {

    //variabili
    private int a,b,i;
    private float f,dataFrom,dataTo;
    private char c;
    private short s;

    //variabili risultati
    private int r2;
    private float r1,r3,r4,r6;
    private long r5;

    public EserciziTipi(float dataFrom){
        this.dataFrom = dataFrom;
    }

    public EserciziTipi(int a, int b, int i, float f, char c, short s) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.f = f;
        this.c = c;
        this.s = s;
    }

    public void divisione(){
        r1 = (float) a / b;
        System.out.println(r1);
    }

    public void moltiplicazione(){
        r2 = (short) (s * c);
        System.out.println(r2);
    }

    public void somma(){
        r3 = f + i;
        System.out.println(r3);
    }

    public void sottrazione(){
        r4 = r1 - r2 - r3;
        System.out.println(r4);
    }

    public void sommaTotale(){
        r5 = 50000L + (long)((a + b + i + f + s + c) * 10);
        System.out.println(r5);
    }

    public void PoundToKilogram(){
        dataTo =  dataFrom * 0.45359237f;
        System.out.println(dataFrom + " lb in chilograms are: " + dataTo + " Kg");
    }

    public void CelsiusToFarenheit(){
        dataTo =  (dataFrom * 9 / 5) + 32;
        System.out.println(dataFrom + " C' in farenheit are: " + dataTo + " F'");
    }

}
