package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository implements MovieRepositoryInterface{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public List<Movie> list() {
        System.out.println("list() from MovieRepo");
        return jdbcTemplate.query("SELECT ID, TITLE, GENRE FROM MOVIES",
                    (rs,rowNum) -> new Movie(rs.getLong("ID"),rs.getString("TITLE"), rs.getString("GENRE")));
    }

    @Override
    public Movie getById(long id) {
        return jdbcTemplate.queryForObject("SELECT D, TITLE, GENRE FROM MOVIES FROM MOVIES WHERE ID=?",
                new Object[]{id},
                (rs,rowNum) -> new Movie(rs.getLong("ID"),
                        rs.getString("TITLE"), rs.getString("DESCRIPTION"), rs.getString("GENRE")));
    }
}
