package org.example;

public class Main {
    public static void main(String[] args) {
        EserciziTipi tipi1 = new EserciziTipi(5,3,6,3.14f,'a', (short) 5000);
        EserciziTipi tipi2 = new EserciziTipi(34.5f);

        //Esercizio 1
        tipi1.divisione();
        tipi1.moltiplicazione();
        tipi1.somma();
        tipi1.sottrazione();
        System.out.println("\n");

        //Esercizio 2
        tipi1.sommaTotale();
        System.out.println("\n");

        //Esercizio 3
        tipi2.PoundToKilogram();
        System.out.println("\n");

        //Esercizio 4
        tipi2.CelsiusToFarenheit();
        System.out.println("\n");

        EserciziComandi comandi = new EserciziComandi();

        //Esercizio 5
        comandi.numberInWord(5);
        System.out.println("\n");

        //Esercizio 6
        comandi.sumModule();
        System.out.println("\n");

        //Esercizio 7
        comandi.sumOddEven();
        System.out.println("\n");

        EserciziStringhe stringhe = new EserciziStringhe();

        //Esercizio 8
        stringhe.printDoubleChar("tazza pazza");
        System.out.println("\n");

        EserciziArray array = new EserciziArray();

        //Esercizio 10
        array.arrayOperations();
        System.out.println("\n");

        //Esercizio 11
        int[][] matrix1 = {{1,2,3},{0,1,2},{0,0,1}};
        array.isUnderTriangular(matrix1);
        int[][] matrix2 = {{1,0,0},{1,2,0},{1,2,3}};
        array.isUpperTriangular(matrix2);
        System.out.println("\n");

        //Esercizio 12
        array.searchInArray(15);
        System.out.println("\n");
    }
}