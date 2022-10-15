package com.movies.MovieList.repository;

import com.movies.MovieList.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer> {


}
