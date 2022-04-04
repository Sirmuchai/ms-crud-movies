package com.safaricom.microservices.mscrudmovies.service;

import com.safaricom.microservices.mscrudmovies.model.request.MovieRequest;
import com.safaricom.microservices.mscrudmovies.model.request.UpdateMovieRequest;
import com.safaricom.microservices.mscrudmovies.model.response.ApiResponse;
import reactor.core.publisher.Mono;

public interface ApiService {
    Mono<ApiResponse> createMovie(MovieRequest movieRequest);
    Mono<ApiResponse> fetchMovieList();
    Mono<ApiResponse> updateMovie(UpdateMovieRequest request);
    Mono<ApiResponse> deleteMovie(long id);
}