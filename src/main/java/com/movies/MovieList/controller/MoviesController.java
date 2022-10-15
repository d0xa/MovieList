package com.movies.MovieList.controller;

import com.movies.MovieList.model.Movies;
import com.movies.MovieList.repository.MoviesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MoviesController {
    private MoviesRepository repository;

    MoviesController(MoviesRepository repository){
        this.repository = repository;
    }
    @GetMapping("/movies")
    String all(){
        List<Movies> movies = repository.findAll();
        return movies.toString();
    }
    /**
     * TODO: implement /addmovie and / deleteMovie
     * HINT: look into  h2 databases and Post methods
     * HINT: lok into controller model repository design pattern
     */



}
