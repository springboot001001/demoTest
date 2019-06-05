package com.spring.jpa.jpa.service;

import com.spring.jpa.jpa.Repository.movieRepository;
import com.spring.jpa.jpa.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieServer {
   @Autowired
    private movieRepository moviieRepository;


   public void sava(Movie movie){
       this.moviieRepository.save(movie);
   }

   public void del(Integer id){
    this.moviieRepository.deleteById(id);
   }

   public List<Movie> finAll(){
       return this.moviieRepository.findAll();
   }

   public Movie select(Integer id){
      return this.moviieRepository.findById(id).get();
   }

}
