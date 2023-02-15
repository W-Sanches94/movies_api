package com.bnta.movies_api.Repositories;

import com.bnta.movies_api.Models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    // MOVIE is the model, and LONG is the datatype of the PRIMARY key, which we set as LONG.

    @Service
    public class MovieService{
        @Autowired
        private  MovieRepository movieRepository;



    }
}
