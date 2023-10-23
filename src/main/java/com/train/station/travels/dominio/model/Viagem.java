package com.train.station.travels.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origem;
    private String destino;
    private LocalDateTime dataPartida;
    private LocalDateTime dataChegada;
    private int bilhetesVendidos;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public LocalDateTime getDataPartida() {
        return dataPartida;
    }
    public void setDataPartida(LocalDateTime dataPartida) {
        this.dataPartida = dataPartida;
    }
    public LocalDateTime getDataChegada() {
        return dataChegada;
    }
    public void setDataChegada(LocalDateTime dataChegada) {
        this.dataChegada = dataChegada;
    }
    public int getBilhetesVendidos() {
        return bilhetesVendidos;
    }
    public void setBilhetesVendidos(int bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }

    
}

    
    

        

