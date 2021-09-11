package org.example;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        DecimalFormat decimalf = new DecimalFormat("#.###");
        decimalf.setRoundingMode(RoundingMode.CEILING);

        //Setting up inputs
        Scanner scanner = new Scanner(System.in);
        int length, width, sqrFt;
        float sqrM;
        final float conFact = .092903f;

        System.out.println( "What is the length of the room in feet? " );

        length = scanner.nextInt();

        System.out.println( "What is the width of the room in feet? " );
        width = scanner.nextInt();

        sqrFt = length * width;

        sqrM = sqrFt * conFact;

        System.out.println( "You entered dimensions of " + length + " feet by " + width + " feet.\n" + "The area is\n" + sqrFt + " square feet\n" + decimalf.format(sqrM) + " square meters" );

    }
}
