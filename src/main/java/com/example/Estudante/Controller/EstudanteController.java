package com.example.Estudante.Controller;

import com.example.Estudante.Model.EstudanteModel;
import com.example.Estudante.Repository.EstudanteRepository;
import com.example.Estudante.Services.EstudanteServices;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteServices estudanteServices;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteServices.criarAluno(estudanteModel);
    }
    @GetMapping
    public List<EstudanteModel> listarEstudante() {
        return estudanteServices.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteServices.deletarEstudante(id);
    }

}
