package com.juan.pt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.pt.dto.Juegos;

public interface IJuegosDAO extends JpaRepository<Juegos,Integer> {

}
