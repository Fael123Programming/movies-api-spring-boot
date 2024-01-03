package dev.leafar.movies.service;

import dev.leafar.movies.domain.Movie;
import dev.leafar.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> movie(String imdbId) {
        return this.movieRepository.findMovieByImdbId(imdbId);
    }
}
