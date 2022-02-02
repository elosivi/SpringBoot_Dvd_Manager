package com.mycompany.dvdstore.web.api;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> list(){
        System.out.println("tadammmm!");
        System.out.println(movieService.getMovieList());
        return movieService.getMovieList();
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable("id")int number){
        System.out.println("afficher 1 facture");
        return movieService.getMovieById(number);
    }

    @PostMapping("")
    public String add(@RequestBody Movie movie){
        System.out.println("Title to add :" +movie.getTitle()+"/");

        movie.setTitle(movie.getTitle());
        movie.setGenre(movie.getGenre());
        movie.setDescription(movie.getDescription());
        movieService.registerMovie(movie);
        return"movie-added";
    }
}
