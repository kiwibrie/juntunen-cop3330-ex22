package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int x = 3;
        int[] intArray = new int[x];

        myApp.getInput(x, intArray);

        int largest;
        if(myApp.checkUnique(intArray)){
            largest = myApp.findLargest(intArray);
        } else {
            return;
        }

        myApp.printOutput(largest);

    }

    public void printOutput(int largest){
        System.out.printf("The largest number is %d.", largest);
    }

    public boolean checkUnique(int[] array){
        int curInt, checkInt;
        for(int i = 0; i < array.length; i++){
            curInt = array[i];
            for(int j = 0; j < array.length; j++){
                checkInt = array[j];
                if(i == j) break;
                if(curInt == checkInt){
                    return false;
                }
            }
        }
        return true;
    }

    public int findLargest(int[] array){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }

    public void getInput(int x, int[] intArray){
        for(int i = 0; i < x; i++){
            intArray[i] = promptInput(i);
        }
    }

    public int promptInput(int i){
        String place = " ";
        switch (i){
            case 0: place = "first "; break;
            case 1: place = "second "; break;
            case 2: place = "third "; break;
            default: break;
        }
        System.out.printf("Enter the %s"+"number: ", place);
        return Integer.parseInt(in.nextLine());
    }
}