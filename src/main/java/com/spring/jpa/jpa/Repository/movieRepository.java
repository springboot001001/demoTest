package com.spring.jpa.jpa.Repository;

import com.spring.jpa.jpa.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Integer> {

}
