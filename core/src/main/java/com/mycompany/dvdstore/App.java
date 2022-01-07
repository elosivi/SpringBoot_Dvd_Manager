package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * by Elodie BARBE
 * janv 2022
 * Udemy training project
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Welcome!\n" );
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }


}
