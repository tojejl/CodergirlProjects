package com.company;
import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
        // write your code here
        //ask user for table size, size should be no larger than 20
        //user will enter a number.
        //import scanner
        //declare variables
        //computer will print out on own line multiples from 0*0 to size * sizes
        System.out.print("Welcome to Multiplication Tables\n" +
                "\nHow large would you like to see them? (Number should not exceed 20.)  ");

        int counter;
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        System.out.print("\n");
        //writing the code to solve the multiplication tables
        //size will determine the amount of rows
        //only one column. System.out.print(0*0 = answer)method to return the answer?
        //counter needed to counter from 0 to user supplied number. for (int columns = 0; columns <1; columns ++)
        // multiple table (answer = counter++ * size) should be second loop?

        for (counter = 0; counter <= size; counter++)// correct equation, counts from 0 to 4.
        {
            for (int row = 0; row <= size; row++)
            {
                System.out.println(counter + " * " + row + " = " + (row * counter));
            }
            //System.out.println();
        }
    }
}

