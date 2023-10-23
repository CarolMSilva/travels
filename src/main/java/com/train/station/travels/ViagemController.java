package com.train.station.travels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.station.travels.model.Analise;
import com.train.station.travels.model.Viagem;
import com.train.station.travels.service.ViagemService;

public class ViagemController {
    @RestController
@RequestMapping("/api/viagens")
public class ViagemController {
    @Autowired
    
   
private ViagemService viagemService;

    @GetMapping
    public List<Viagem> listarViagens() {
        return viagemService.listarViagens();
    }

    
    }

    @

    }

@PostMapping
    public Viagem criarViagem(@RequestBody Viagem viagem) {
        
       
return viagemService.criarViagem(viagem);
    }

 /**
 * @return
 */
@GetMapping("/analise-bilhetes")
    public Analise calcularAnaliseBilhetesVendidos() {
        return viagemService.calcularAnaliseBilhetesVendidos();
    } 
   
    


   
// Implemente métodos para atualizar, excluir e obter uma única viagem.

