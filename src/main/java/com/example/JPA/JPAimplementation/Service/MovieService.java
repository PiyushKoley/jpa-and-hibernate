package com.example.JPA.JPAimplementation.Service;

import com.example.JPA.JPAimplementation.Models.Movie;
import com.example.JPA.JPAimplementation.Repository.MovieRepository;
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

    public void createMovie(Movie movie) {

        movieRepository.save(movie);
    }

}
