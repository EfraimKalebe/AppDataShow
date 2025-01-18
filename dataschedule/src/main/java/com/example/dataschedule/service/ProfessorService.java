package com.example.dataschedule.service;

import com.example.dataschedule.model.Professor;
import com.example.dataschedule.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository professorRepository;

    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }

}
