package com.example.dataschedule.controller;

import com.example.dataschedule.model.*;
import com.example.dataschedule.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {
    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public String criarAgendamento(@RequestBody Agendamento agendamento) {
        if (agendamentoService.VerificarDisponibilidade(agendamento.getDataHoraInicio(), agendamento.getDataHoraFim())) {
            agendamentoService.salvAgendamento(agendamento);
            return "Agendamento criado com sucesso!";
        }
        return "Data Show não disponível!";
    }
}
