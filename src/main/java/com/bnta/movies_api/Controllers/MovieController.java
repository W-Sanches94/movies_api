package com.bnta.movies_api.Controllers;

import com.bnta.movies_api.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping (value = "/movies")
public class Movie{

    @Autowired
    private MovieService movieService;

//    A MovieRepository to connect the model to the database
//    A MovieController with the following routes:
//    GET /movies
//    GET /movies/{id}
//    POST /movies
//    A MovieService to connect the controller and repository
//    Test the routes using Postman to ensure you can add a new movie and see those already in the database.

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie>movie = movieService.getAllMovies();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable long id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
