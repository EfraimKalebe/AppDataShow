package com.example.dataschedule.repository;

import com.example.dataschedule.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByDataHoraInicioBetweenOrDataHoraFimBetween(
            LocalDateTime start, LocalDateTime end, LocalDateTime start2, LocalDateTime end2);
}
