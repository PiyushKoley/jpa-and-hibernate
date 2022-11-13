package com.example.JPA.JPAimplementation.Controller;


import com.example.JPA.JPAimplementation.Models.Movie;
import com.example.JPA.JPAimplementation.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get-AllMovies")
    public List<Movie> getAllMovies() {

        return movieService.getAllMovies();
    }

    @PostMapping("/create-movie")
    public void createMovie(@RequestBody() Movie movie){

        movieService.createMovie(movie);

    }
}
