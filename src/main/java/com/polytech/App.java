package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        CoursBuilder builder = new CoursBuilder();

        Cours cours = builder
                .setMatiere("Génie Logiciel")
                .setEnseignant("Mr Oussama")
                .build();

        System.out.println(cours);
    }
}
