package com.company;

public class Temperatures {

    public static void main(String[] args) {
	// write your code here
        //create two-dimensional grid with temps from neighborhood garden witch
        //grid should be 7 by 4
        //program will calculate the average temperature for each day
        //program with calculate the average temp for each time
        //program will calculate the average temp overall.

        System.out.println("Temperature Calculator" +
                "\n");
        System.out.println("The data provided are:");
//Prints out matrix with the daily temps for the week at 7 AM, 3PM, 7PM, and 3AM
       int [][] temps = {
               {68, 70, 76, 70, 68, 71, 75},
               {76, 76, 87, 84, 82, 75, 83},
               {73, 72, 81, 78, 76, 73, 77},
               {64, 65, 69, 68, 70, 74, 72}};


        String[] hours = {"7 AM:", "3 PM:", "7 PM:", "3 AM:"};
        for (int rows = 0 ; rows < 4; rows++) {
            System.out.print(hours[rows] + " ");

            for (int column = 0; column < 7; column++) {
                if (column > 0) System.out.print (", ");
                System.out.print(temps [rows] [column]);
            }
            System.out.println();
        }
        System.out.println();


//calculates the average temperature for each day
        int sumSun = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for ( int dayOfWeek = 0; dayOfWeek <temps[0].length; dayOfWeek++) {
                sumSun += temps[timeOfDay][0];

            }
        }
        int sizeSunday = temps.length *temps[0].length;
        int sundayAverage = sumSun/ sizeSunday;

        int sumMon = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for (int dayOfWeek = 0; dayOfWeek < temps[1].length; dayOfWeek++) {
                sumMon +=temps[timeOfDay][1];
            }
        }
        int sizeMonday = temps.length*temps[1].length;
        int mondayAverage = sumMon / sizeMonday;

        int sumTues = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for (int dayOfWeek = 0; dayOfWeek < temps[2].length; dayOfWeek++) {
                sumTues +=temps[timeOfDay][2];
            }
        }
        int sizeTuesday = temps.length * temps[2].length;
        int tuesdayAverage = sumTues / sizeTuesday;

        int sumWed = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for(int dayOfWeek = 0; dayOfWeek < temps[3].length; dayOfWeek++) {
                sumWed +=temps[timeOfDay][3];
            }
        }
        int sizeWednesday = temps.length * temps[3].length;
        int wednesdayAverage = sumWed / sizeWednesday;

        int sumThurs = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for(int dayOfWeek = 0; dayOfWeek < temps[3].length; dayOfWeek++) {
                sumThurs += temps[timeOfDay][4];
            }
        }
        int sizeThursday = temps.length * temps[3].length;
        int thursdayAverage = sumThurs / sizeThursday;

        int sumFri = 0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for(int dayOfWeek = 0; dayOfWeek < temps[3].length; dayOfWeek++) {
                sumFri += temps[timeOfDay][5];
            }
        }
        int sizeFriday = temps.length * temps[3].length;
        int fridayAverage = sumFri / sizeFriday;

        int sumSat =0;
        for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
            for(int dayOfWeek = 0; dayOfWeek < temps[3].length; dayOfWeek++) {
                sumSat += temps[timeOfDay][6];
            }
        }
        int sizeSaturday = temps.length * temps[3].length;
        int saturdayAverage = sumSat / sizeSaturday;

        //Calculates the average weekly average of each hour listed
        int sumSevenAM = 0;
        for (int dayOfWeek = 0; dayOfWeek < temps[0].length; dayOfWeek++) {
            for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
                sumSevenAM += temps[0][dayOfWeek];
            }
        }
        int sizeSevenAM = temps[0].length * temps.length;
        int sevenAMAverage = sumSevenAM / sizeSevenAM;

        int sumThreePM = 0;
        for (int dayOfWeek = 0; dayOfWeek < temps[1].length; dayOfWeek++) {
            for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
                sumThreePM += temps[1][dayOfWeek];
            }
        }
        int sizeThreePM = temps[0].length * temps.length;
        int threePMAverage = sumThreePM / sizeThreePM;

        int sumSevenPM = 0;
        for (int dayOfWeek = 0; dayOfWeek < temps[2].length; dayOfWeek++) {
            for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
                sumSevenPM += temps[2][dayOfWeek];
            }
        }
        int sizeSevenPM = temps[0].length * temps.length;
        int sevenPMAverage = sumSevenPM / sizeSevenPM;

        int sumThreeAM = 0;
        for (int dayOfWeek = 0; dayOfWeek < temps[1].length; dayOfWeek++) {
            for (int timeOfDay = 0; timeOfDay < temps.length; timeOfDay++) {
                sumThreeAM +=temps[3][dayOfWeek];
            }
        }
        int sizeThreeAM = temps[0].length * temps.length;
        int threeAMAverage = sumThreeAM / sizeThreeAM;


        System.out.println("Based on that data, the following are the average temperatures for the week. \n");
        System.out.println("Sun: " + sundayAverage + "\nMon: " + mondayAverage + "\nTue: " + tuesdayAverage +
                "\nWed: " + wednesdayAverage + "\nThu: " + thursdayAverage + "\nFri: " + fridayAverage + "\nSat: " + saturdayAverage +
                "\n \n7 AM: " + sevenAMAverage + "\n3 PM: " + threePMAverage + "\n7 PM: " + sevenPMAverage + "\n3 AM: " + threeAMAverage );

//Calculates the overall average temperature of the given data.
        int sumAverage = 0;
        int count = 0;
        for (int dayOfWeek = 0; dayOfWeek < temps.length; dayOfWeek++) {
            for (int timeOfDay = 0; timeOfDay < temps[0].length; timeOfDay++) {
                count ++;
                sumAverage += temps[dayOfWeek][timeOfDay];
            }
        }
        //int sizeAverage = temps.length * temps.length;
        int overallAverage =   sumAverage / count;


        System.out.println("\nThe final average temperature for the week was: \n\nOverall: "+overallAverage);
        
    }
}
