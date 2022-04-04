package com.safaricom.microservices.mscrudmovies.controller;

import com.safaricom.microservices.mscrudmovies.model.request.MovieRequest;
import com.safaricom.microservices.mscrudmovies.model.request.UpdateMovieRequest;
import com.safaricom.microservices.mscrudmovies.model.response.ApiResponse;
import com.safaricom.microservices.mscrudmovies.service.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private ApiServiceImpl apiService;

    @PostMapping(value = "/createMovie")
    public Mono<ApiResponse> createMovie(@RequestBody MovieRequest movieRequest){
        return apiService.createMovie(movieRequest);
    }

    @GetMapping("/fetchMovies")
    public Mono<ApiResponse> fetchListOfMovies(){
        return apiService.fetchMovieList();
    }

    @PostMapping("/updateMovie")
    public Mono<ApiResponse> updateMovie(@RequestBody UpdateMovieRequest request){
        return apiService.updateMovie(request);
    }

    @DeleteMapping("/deleteMovie/{id}")
    public Mono<ApiResponse> deleteMovie(@PathVariable("id") long id){
        return apiService.deleteMovie(id);
    }
}