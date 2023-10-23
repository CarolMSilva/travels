package com.train.station.travels.dominio.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.station.travels.dominio.model.Viagem;

public class UserRepository {
    
    @Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {
}
}
