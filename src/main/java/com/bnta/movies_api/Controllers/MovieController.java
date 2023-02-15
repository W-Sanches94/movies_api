package com.bnta.movies_api.Controllers;

import com.bnta.movies_api.Models.Movie;
import com.bnta.movies_api.Services.MovieService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class MovieController {

    @RestController
    @RequestMapping(value = "/movies")
    public class MovieController{

        @Autowired
        private MovieService movieService;

//    A MovieRepository to connect the model to the database
//    A MovieController with the following routes:
//    GET /movies
//    GET /movies/{id}
//    POST /movies
//    A MovieService to connect the controller and repository
//    Test the routes using Postman to ensure you can add a new movie and see those already in the database.

        //route to get All movies
    @GetMapping
        public ResponseEntity<List<Movie>>getAllMovies(){
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
        public ResponseEntity<Movie> getMovieByiD(@PathVariable Long id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @PostMapping
        public ResponseEntity<Movie> addNewMovie(@ResponseBody Movie movie){
        movieService.addNewMovie(movie);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }

    }
}
