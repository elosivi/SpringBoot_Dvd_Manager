package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.entity.Movie;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    public List<Movie> movies = new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle()+ " / "+ movie.getGenre()+ " has been added into memory");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
