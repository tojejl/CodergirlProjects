package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        //Your code goes below here.

//This portion will figure out if the restaurant will make individual sales goals
        out.println("Checking sales goals.");
        out.println("The sales goals for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        int dailyVeggieGoal = keyboard.nextInt();

        if (dailyVeggieGoal == goalForVeggies) {
            out.println("Made goal for Veggie Sandwiches.");
        } else if (dailyVeggieGoal > goalForVeggies) {
            out.println("Made goal for Veggie Sandwiches.");
        } else {
            out.println("Fell Short");
        }
        out.print("\n");
        out.println("The sales goals for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        int dailyBurgerGoal = keyboard.nextInt();

        if (dailyBurgerGoal == goalForBurgers) {
            out.println("Made goal for Burgers.");
        } else if (dailyBurgerGoal > goalForBurgers) {
            out.println("Made goal for  Burgers");
        } else {
            out.println("Fell Short");
        }
        out.print("\n");
        out.println("The sales goals for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        int dailySubGoal = keyboard.nextInt();

        if (dailySubGoal == goalForSubs ) {
            out.println("Made goal for Sub Sandwiches.");
        } else if (dailySubGoal > goalForSubs) {
            out.println("Made goal for Sub Sandwiches");
        } else {
            out.println("Fell short");
        }
        out.print("\n");
        out.println("The sales goals for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        int dailySoupGoal = keyboard.nextInt();

        if (dailySoupGoal == goalForSoup) {
            out.println("Made goal for soup.");
        } else if (dailySoupGoal > goalForSoup) {
            out.println("Made goal for soup.");
        } else{
            out.println("Fell short");
        }
        int allDailytotals = (dailySoupGoal + dailySubGoal + dailyBurgerGoal + dailyVeggieGoal);
        int targetSalesGoals = (goalForVeggies + goalForBurgers + goalForSubs + goalForSoup);

//This will sort out if the restaurant will/will not make all daily sales goal encompassing all items
        out.print("\n");
        if (allDailytotals >= targetSalesGoals){
            out.println("Made goal for everything!");
        }
        else if (allDailytotals <= targetSalesGoals) {
            out.println("\n");
        }
        else{
            out.println("\n");
        }



    }
}










