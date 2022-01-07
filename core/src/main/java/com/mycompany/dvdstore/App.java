package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;


/**
 * by Elodie BARBE elodiebarbe.pro@gmail.com
 * janv 2022
 * Udemy training project
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Welcome!\n" );

        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

        movieController.setMovieServiceInterface(movieService);
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);

        movieController.addUsingConsole();
    }


}
