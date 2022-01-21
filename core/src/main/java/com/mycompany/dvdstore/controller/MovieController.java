package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole(){
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
