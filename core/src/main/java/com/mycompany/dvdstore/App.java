package com.mycompany.dvdstore;

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
    public static MovieService movieService = new MovieService();

    public static void main( String[] args )
    {

        System.out.println( "Welcome!" );
        AddMovie();
    }

    public static void AddMovie(){
        Movie newMovie = new Movie();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le titre");
        String title = sc.nextLine();
        newMovie.setTitle(title);

        System.out.println("Entrez le genre");
        String genre = sc.nextLine();
        newMovie.setGenre(genre);

        movieService.registerMovie(newMovie);

    }
}
