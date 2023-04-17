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
        String name = cons.readLine("li gio simi mia?");
        if (name.length() > 0) {
            if (name.equals("rayson")) {
            System.out.println("Lmao fuck you loser");
        }
            else {
             System.out.printf("\nHello %s you today damn chio", name);
            
             Integer age = 69;
        System.out.printf("\n%s you damn old sia already %d years old", name, age);

        String mothers_name = "dickrider";
        System.out.printf( "\ndid you know my mother's name is %s", mothers_name);

        String hobby = cons.readLine("\nWhat do you like to do in your free time %s?", name);
        hobby.trim();
        if (hobby.equals("genshin")) {
            System.out.printf("LOL hope you get a Qiqi");
        } else if (hobby.equals("swimming")) {
            System.out.println("Michael Phelps siol");
        } else if (hobby.equals("dance")) {
            System.out.println("i bet you suck");
        } else if (hobby.length() == 0 || hobby.equals("nothing")) {
            System.out.println("touch grass you weeb");
        }
         else {
            System.out.println("Wow so interesting I totally wasn't programmed to pretend to care");
        }

        }
        
        } else {
            System.out.printf("do you think this is a fucking joke");
    
        }
    

       
    
    }

}
