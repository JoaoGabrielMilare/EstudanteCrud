package com.example.Estudante.Repository;

import com.example.Estudante.Model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
    Long id(Long id);

    Long id(Long id);
}
