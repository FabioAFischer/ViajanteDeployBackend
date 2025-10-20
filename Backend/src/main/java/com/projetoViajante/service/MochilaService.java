package com.projetoViajante.service;

import java.util.List;

import com.projetoViajante.dto.MochilaDTO;
import com.projetoViajante.entity.Mochila;

public interface MochilaService {

    Mochila salvarMochila (MochilaDTO mochilaDTO);

    List<Mochila> listarMochila (Long mochila_id);

    Mochila atualizarMochila (Long id, MochilaDTO mochilaDTO);

    void deletarMochila (Long idMochila);
    
}
