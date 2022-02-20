package com.example.test.movies.data;

import com.example.test.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}