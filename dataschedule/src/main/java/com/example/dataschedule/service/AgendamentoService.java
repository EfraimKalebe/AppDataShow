package com.example.dataschedule.service;

import com.example.dataschedule.model.Agendamento;
import com.example.dataschedule.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;



import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public boolean VerificarDisponibilidade(LocalDateTime inicio, LocalDateTime fim){
        List<Agendamento> conflitos = agendamentoRepository.findByDataHoraInicioBetweenOrDataHoraFimBetween(inicio, fim, inicio, fim);
        return conflitos.isEmpty();    
}

public Agendamento salvAgendamento(Agendamento agendamento){
    return agendamentoRepository.save(agendamento);
}

}
