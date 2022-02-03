package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.DefaultMovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }


    @PostMapping("/movie/add")
    public String addMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult results){
        System.out.println("Title to add :" +movieForm.getTitle()+"/");
        if(results.hasErrors()){
            System.out.println("form doesn't valid");
            return "add-movie-form";
        }
        System.out.println("form valid");
        Movie movie = new Movie();
        movie.setTitle(movieForm.getTitle());
        movie.setGenre(movieForm.getGenre());
        movie.setDescription(movieForm.getDescription());
        movieService.registerMovie(movie);
        return"movie-added";
    }
}
