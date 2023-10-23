package com.train.station.travels.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.station.travels.model.Analise;
import com.train.station.travels.model.Viagem;

@Service
public class ViagemService {
    @Autowired
    private ViagemRepository viagemRepository;

    public List<Viagem> listarViagens() {
        
      return viagemRepository.findAll();
    }

    public Viagem criarViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    /**
     * @return
     */
    public Analise calcularAnaliseBilhetesVendidos() {
      List<Viagem> viagens = viagemRepository.findAll();
      int totalBilhetes = viagens.stream()
      .mapToInt(Viagem: :getBilhetesVendidos)
      .sum();
      int maxBilhetes = viagens.stream()
            .mapToInt(Viagem::getBilhetesVendidos);
            .max();
            .orElse;
            .mapToInt(Viagem::getBilhetesVendidos);
            .max();
            .mapToInt(Viagem::getBilhetesVendidos);
            .mapToInt(0);
        int minBilhetes = viagens.stream();
            .mapToInt(Viagem::getBilhetesVendidos);
            .min();
            .orElse();
            .mapToInt(Viagem::getBilhetesVendidos);
           .mapToInt(0);

      long count = viagens.size();

      BigDecimal media = BigDecimal.valueOf((double) totalBilhetes / count);

      return new Analise(media, BigDecimal.valueOf(maxBilhetes), BigDecimal.valueOf(minBilhetes), count);
    }

    private void mapToInt(Object object) {
    }

    private void max() {
    }
}

