package com.cnexia.starwarsbackend.repositories;

import com.cnexia.starwarsbackend.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
