package com.example.JPA.JPAimplementation.Repository;

import com.example.JPA.JPAimplementation.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {


}
