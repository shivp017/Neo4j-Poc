package com.stackroute.controller;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "api/v1")
public class CriticController {
    private RatingService ratingService;

    @Autowired
    private CriticController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping(value = "/critics")
    public Collection<Critic> getAllCritic() {
        return ratingService.getAllCritic();
    }

    @GetMapping(value = "/movies")
    public Iterable<Movie> getAllMovie() {
        return ratingService.getAllMovie();
    }

    @PostMapping(value = "/critic")
    public Critic saveCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.saveCritic(critic);
    }

    @PutMapping(value = "/critic")
    public Critic updateCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.updateCriticById(critic);
    }

    @PostMapping(value = "/movie")
    public Movie saveMovie(@RequestBody Movie movie) {
        System.out.println("****" + movie);
        return ratingService.saveMovie(movie);
    }

    @PutMapping(value = "/movie")
    public Movie updateMovie(@RequestBody Movie movie) {
        System.out.println("****" + movie);
        return ratingService.updateMovieById(movie);
    }

    @DeleteMapping(value = "/critic")
    public Critic deleteCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.deleteCriticById(critic);
    }

    @DeleteMapping(value = "/movie")
    public Movie deleteMovie(@RequestBody Movie movie) {
        System.out.println("****" + movie);
        return ratingService.deleteMovieById(movie);
    }

    @PostMapping(value = "/critic/set")
    public Critic setRelation(@RequestParam long criticId, long movieId, int rating) {
        return ratingService.setRelation(criticId, movieId, rating);
    }


}
