/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program prompts the user for them name and then uses that name in an output screen
 import java.util.Scanner;
 public class ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt for enter name
            System.out.print("What's your name? ");
            String name = input.nextLine();

        // printing name with greeting
        System.out.println("Hello "+name+"! Nice to meet you!");
    }//end of main
 }//end of class
