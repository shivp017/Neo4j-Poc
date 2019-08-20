package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;

import java.util.Collection;

public interface RatingService {
    Critic getCriticById(Critic critic);

    Critic saveCritic(Critic movie);

    Collection<Critic> getAllCritic();

    Critic deleteCriticById(Critic critic);

    Critic updateCriticById(Critic movie);

    Movie getMovieById(Movie movie);

    Movie saveMovie(Movie movie);

    Iterable<Movie> getAllMovie();

    Movie deleteMovieById(Movie movie);

    Movie updateMovieById(Movie movie);

    Critic setRelation(long criticId,long movieId,int rating);
}

