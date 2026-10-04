package com.exemplo.professores.service;

import com.exemplo.professores.model.Professor;
import com.exemplo.professores.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> listar() {
        return repository.findAll();
    }

    public List<Professor> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Professor> buscarPorArea(String area) {
        return repository.findByAreaIgnoreCase(area);
    }

    public Professor cadastrar(Professor professor) {
        return repository.save(professor);
    }

    public Professor editar(Long id, Professor dados) {
        Professor professor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        professor.setNome(dados.getNome());
        professor.setEmail(dados.getEmail());
        professor.setArea(dados.getArea());
        professor.setTelefone(dados.getTelefone());

        return repository.save(professor);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
