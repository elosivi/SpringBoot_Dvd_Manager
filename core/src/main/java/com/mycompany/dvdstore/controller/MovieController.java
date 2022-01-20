package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private static MovieServiceInterface movieService;

    public static MovieServiceInterface getMovieService() {
        return movieService;
    }

    public static void setMovieService(MovieServiceInterface movieService) {
        MovieController.movieService = movieService;
    }

    public void addUsingConsole(){
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
