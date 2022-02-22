package com.example.service1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/movies")
@RestController
public class MovieController {
    private List<Movie> Movies = Arrays.asList(
            new Movie(1, "Avatar", "H1". "He1", 5);
            new Movie(2, "Titanic", "H2", "He2", 5));
    
    @GetMapping
    public List<Movie> getAllMovies() {
        return Movies;
    }
    
    @GetMapping("/{id}")
    public Bank getMovieById(@PathVariable int id) {
        return Movies.stream()
                        .filter(Movie -> Movie.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}
