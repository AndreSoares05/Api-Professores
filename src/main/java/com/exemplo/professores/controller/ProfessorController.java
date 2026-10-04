package com.exemplo.professores.controller;

import com.exemplo.professores.model.Professor;
import com.exemplo.professores.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> listar() {
        return service.listar();
    }

    @GetMapping("/nome/{nome}")
    public List<Professor> buscarPorNome(@PathVariable String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/area/{area}")
    public List<Professor> buscarPorArea(@PathVariable String area) {
        return service.buscarPorArea(area);
    }

    @PostMapping
    public Professor cadastrar(@RequestBody Professor professor) {
        return service.cadastrar(professor);
    }

    @PutMapping("/{id}")
    public Professor editar(@PathVariable Long id, @RequestBody Professor professor) {
        return service.editar(id, professor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
