package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        String in = new String();

        System.out.print("What is the input string? ");

        in = s.nextLine();

        System.out.print(in + " has " + in.length() + " characters.");

        s.close();

    }
}
