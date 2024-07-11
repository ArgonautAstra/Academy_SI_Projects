package org.example;

public class EserciziStringhe {

    public void printDoubleChar(String s){

        char[] a = s.toCharArray();

        for(int i = 0; i < s.length()-1; i++)
            if(a[i] == a[i+1])
                if(a[i] != 'p' || a[i] != 's')
                    System.out.println("Le doppie sono: " + a[i] +""+ a[i]);
                else
                    System.out.println("C'è una doppia: " + a[i]);
    }
}
