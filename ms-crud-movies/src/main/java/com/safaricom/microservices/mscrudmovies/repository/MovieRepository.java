package com.safaricom.microservices.mscrudmovies.repository;

import com.safaricom.microservices.mscrudmovies.model.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MovieRepository extends ReactiveCrudRepository<Movie, Long> {

}