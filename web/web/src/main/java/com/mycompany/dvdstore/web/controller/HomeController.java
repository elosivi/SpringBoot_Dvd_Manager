package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome(){
        System.out.println("tadammmm!");
        return movieService.getMovieList();
    }

    @GetMapping("/add-movie-form")
    public String displayMovieForm(@ModelAttribute Movie movie){
        return "add-movie-form";
    }

}
