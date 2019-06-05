package com.spring.jpa.jpa;

import com.spring.jpa.jpa.Repository.movieRepository;
import com.spring.jpa.jpa.domain.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private movieRepository movieRepository;


    @Test
    public void contextLoads() {
        Movie m=new Movie();
        m.setName("一条狗");
        m.setPrice(50d);
        m.setActionTime(new Date());
        movieRepository.save(m);
    }

}
