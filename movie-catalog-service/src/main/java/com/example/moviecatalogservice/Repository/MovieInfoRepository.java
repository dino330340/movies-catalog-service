package com.example.moviecatalogservice.Repository;

import com.example.moviecatalogservice.model.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {
}
