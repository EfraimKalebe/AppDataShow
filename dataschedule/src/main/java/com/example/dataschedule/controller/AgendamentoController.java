package com.example.dataschedule.controller;

import com.example.dataschedule.model.Agendamento;
import com.example.dataschedule.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {
    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public String criarAgendamento(@RequestBody Agendamento agendamento) {
        if (agendamentoService.verificarDisponibilidade(agendamento.getDataHoraInicio(), agendamento.getDataHoraFim())) {
            agendamentoService.salvarAgendamento(agendamento);
            return "Agendamento criado com sucesso!";
        }
        return "Data Show não disponível!";
    }
}
