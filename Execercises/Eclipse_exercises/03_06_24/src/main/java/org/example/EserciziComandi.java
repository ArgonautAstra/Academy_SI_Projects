package org.example;

public class EserciziComandi {

    public void numberInWord(int a){

        switch (a) {
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DUE");
                break;
            case 3:
                System.out.println("TRE");
                break;
            case 4:
                System.out.println("QUATTRO");
                break;
            case 5:
                System.out.println("CINQUE");
                break;
            case 6:
                System.out.println("SEI");
                break;
            case 7:
                System.out.println("SETTE");
                break;
            case 8:
                System.out.println("OTTO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public void sumModule(){

        int j = 0,res = 0;

        for(int i = 1; i <= 1000; i = i + 4)
            if(j < 5)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                    res += i;
                    j++;
                }
        System.out.println("\n" + res);
    }

    public void sumOddEven(){

        int oddSum = 0, evenSum = 0;

        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0)
                oddSum += i;
            else
                evenSum += i;
        }

        System.out.println("Somma pari: "+ oddSum +", somma dispari: " + evenSum);

        if(oddSum == evenSum)
            System.out.println("La somma dei pari e dei dispari è uguale");
        else if(oddSum > evenSum)
            System.out.println("La somma dei pari è maggiore della somma dei dispari ");
        else
            System.out.println("La somma dei pari è minore della somma dei dispari ");
    }
}
