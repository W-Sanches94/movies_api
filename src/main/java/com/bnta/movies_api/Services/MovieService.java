package com.bnta.movies_api.Services;

import com.bnta.movies_api.Models.Movie;
import com.bnta.movies_api.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

   public List<Movie> getAllMovies(){
       return movieRepository.findAll();
   }
   public Movie getMovieById(long id){
       return movieRepository.findById(id).get();
   }

   public Movie addNewMovie(Movie movie){
       movieRepository.save(movie);
       return movie;
   }
}
