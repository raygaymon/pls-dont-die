package com.example;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Console cons = System.console();
        String name = cons.readLine("What's your name?");
        System.out.printf("\nHello %s you today damn chio", name);
            
             Integer age = 0;
             String askForAge = cons.readLine("\n%s how old are you", name);

             age = Integer.parseInt(askForAge);

             if (age <= 0) {
                System.out.println("Are you a sperm");
             } else if (age > 0 && age <= 2) {
                System.out.println("aww so cute lil babie know how to use computer");
             } else if (age > 2 && age <= 7) {
                System.out.println("enjoy kindergarden");
             } else if (age > 7 && age <= 12) {
                System.out.println("Please study for PSLE");
             } else if (age > 12 && age <= 16) {
                System.out.println("Please study for O levels");
             } else {
                System.out.printf("\n%s You damn old sia already %d years old i hope you like back pain", name, age);
             }

        String mothers_name = "Visa";
        System.out.printf( "\nDid you know my mother's name is %s", mothers_name);

        String hobby = cons.readLine("\nWhat do you like to do in your free time %s?", name);
        hobby.trim();
        if (hobby.equals("genshin")) {
            System.out.printf("LOL hope you get a Qiqi");
        } else if (hobby.equals("swimming")) {
            System.out.println("Michael Phelps siol");
        } else if (hobby.equals("dance")) {
            System.out.println("I bet you suck");
        } else if (hobby.length() == 0 || hobby.equals("nothing")) {
            System.out.println("Touch grass you weeb");
        }
         else {
            switch(hobby) {
                case "running":
                System.out.println("Zoom zoom like a rocket");
                break;
                case "locking":
                System.out.println("So funky I like");
                break;
                case "origami":
                System.out.println("Can you help me fold some swans for my girlfriend");
                break;
                case "rock climbing":
                System.out.println("I bet you have thick strong hands");
                break;
                default: 
                System.out.println("Wow so interesting I totally wasn't programmed to pretend to care");
            }
            
        }

        }
        
    
    

       
    
    }


