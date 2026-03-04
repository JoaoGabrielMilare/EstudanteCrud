package com.example.Estudante.Controller;

import com.example.Estudante.Model.EstudanteModel;
import com.example.Estudante.Repository.EstudanteRepository;
import com.example.Estudante.Services.EstudanteServices;
import jakarta.annotation.PostConstruct;
import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteServices estudanteServices;

    //Busca Estudante
    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteServices.criarAluno(estudanteModel);
    }

    //Cria pessoa
    @GetMapping
    public List<EstudanteModel> listarEstudante() {
        return estudanteServices.findAll();
    }
    //Deletar pessoas
    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteServices.deletarEstudante(id);
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarEstudante(@PathVariable Long id) {
        return estudanteServices.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public EstudanteModel atualizar(@PathVariable Long id,  @RequestBody EstudanteModel estudanteModel) {
        return estudanteServices.atualizar(id, estudanteModel);
    }

}
