package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/{id}")
    public String displayMovieCard(@PathVariable("id")int number, Model model){
        System.out.println("afficher ");
        model.addAttribute("movie",movieService.getMovieById(number));
        return "movie-details";
    }
}
