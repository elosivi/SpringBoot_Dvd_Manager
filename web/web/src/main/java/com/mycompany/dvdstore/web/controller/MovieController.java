package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.DefaultMovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id")int number, Model model){
        System.out.println("afficher ");
        model.addAttribute("movie",movieService.getMovieById(number));
        return "movie-details";
    }

    @PostMapping("")
    public String addMovie(@ModelAttribute Movie movie){
        movieService.registerMovie(movie);
        return"movie-added";
    }
}
