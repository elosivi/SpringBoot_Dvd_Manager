package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private MovieRepositoryInterface movieRepository;

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.list();
    }

    @Override
    public Movie getMovieById(long id) {
        Movie movie = movieRepository.getById(id);
        return movie;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie){
        movieRepository.add(movie);
        return movie;
    }


}
