package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    Movie getMovieById(long id);

    public void registerMovie(Movie movie);
    List<Movie> getMovieList();
}
