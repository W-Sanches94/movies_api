package com.bnta.movies_api.Services;

import com.bnta.movies_api.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService getMovieById(int id){
        return MovieRepository.findBy(id).get();
    }
}
