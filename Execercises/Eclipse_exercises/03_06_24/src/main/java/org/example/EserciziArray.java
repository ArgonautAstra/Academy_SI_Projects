package org.example;

import java.util.Random;

public class EserciziArray {

    public void arrayOperations(){
        int[] array = new int[10];
        array = new int[]{17, 57, 34, 82, 10, 45, 66, 31, 29, 81};

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for(int el : array) {
            if (el > max)
                max = el;
            if (el < min)
                min = el;
            sum += el;
        }

        System.out.println("Max element: " + max + "\nMin element: " + min + "\nTotal: " + sum + "\nAverage: " + sum/10f);
    }

    public void isUnderTriangular(int[][] matrix){

        boolean flag = true;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < i; j++)
                if(matrix[i][j] != 0){
                    flag = false;
                    break;
                }

        if(flag)
            System.out.println("La matrice è diagonale inferiore");
        else
            System.out.println("La matrice non è diagonale inferiore");

    }

    public void isUpperTriangular(int[][] matrix){

        boolean flag = true;

        for(int i = 0; i < 3; i++)
            for(int j = i+1; j < 3; j++)
                if(matrix[i][j] != 0){
                    flag = false;
                    break;
                }

        if(flag = true)
            System.out.println("La matrice è diagonale superiore");
        else
            System.out.println("La matrice non è diagonale superiore");

    }

    public void searchInArray(int x){
        Random rand = new Random();
        int[] array = new int[20];
        boolean flag = false;

        for(int el : array)
            el = rand.nextInt(201) - 100;

        for(int el : array)
            if(el == x) {
                flag = true;
                break;
            }

        if(flag)
            System.out.println("Numero presente");
        else
            System.out.println("Numero NON presente");
    }
}
