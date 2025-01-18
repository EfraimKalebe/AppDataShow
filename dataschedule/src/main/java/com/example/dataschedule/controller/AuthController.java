package com.example.dataschedule.controller;

import com.example.dataschedule.model.Professor;
import com.example.dataschedule.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private ProfessorService professorService;

    @PostMapping("/register")
    public String registrar(@RequestBody Professor professor) {
        professorService.salvarProfessor(professor);
        return "Cadastro realizado com sucesso!";
    }
}
