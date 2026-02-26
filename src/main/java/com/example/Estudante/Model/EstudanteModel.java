package com.example.Estudante.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;
import org.springframework.resilience.annotation.EnableResilientMethods;


@Entity
@Table (name = "TBL_ALUNO")


public class EstudanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_COMPLETO", nullable = false, length = 100)
    private String nome;
    private String email;

    @Column(name = "IDADE_ALUNO")
    private Integer idade;

    public EstudanteModel() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
