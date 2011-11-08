package Patches.Week1.Day2;
// Developed by: Robert "Patches" S. <teh.bloo.box@gmail.com>
// Create a program that calculates investment (14000).
public class Exercise1 {
        public static void main(String[] arguments) {
                short investAmount = 14000;
                double firstYear = investAmount, secondYear = 0, thirdYear = 0;
                //  1.40 = 140%, DEM FRACTIONS
                // NOTE THE LINE BELOW SUCKS BECAUSE I AM BAD AT MATH.
                // JUST FUCKING SAYING
                firstYear += investAmount * 0.40;
                secondYear = firstYear - 1500;
                thirdYear = secondYear * 1.12;
                System.out.println("Initial investment: " + investAmount + "\n---------");
                // Calculate the first years increase by 40%
                System.out.println("Investment in first year increases 40%: " + firstYear );
                System.out.println("Investment loses 1500 in second year: " + secondYear );
                System.out.println("Third year, investment increases by 12%: " + thirdYear );
        }
}
