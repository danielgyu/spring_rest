package com.hismayfly.demo.recommenderapi.controllers;

import com.hismayfly.demo.recommenderapi.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class RecommendationsController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1, "Ice Age", 7.5),
                             new Movie(2, "Happy Feet", 6.4),
                             new Movie(3, "Aligator Tale", 9.1));
    }
}
