package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private static MovieServiceInterface movieServiceInterface;

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

        movieServiceInterface.registerMovie(newMovie);

        AddOneMore();

    }

    public static void AddOneMore(){

            System.out.println(" Add one more moovie? Y/N");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();

            if(response.equalsIgnoreCase("y")){
                AddMovie();
            }else if( response.equalsIgnoreCase("n")) {
                System.out.println("Ok thank!");
            }else{
                System.out.println("wrong choice, please try again");
                AddOneMore();
            }

    }
}
