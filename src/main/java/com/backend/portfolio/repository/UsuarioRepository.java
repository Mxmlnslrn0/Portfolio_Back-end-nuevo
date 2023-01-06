package com.backend.portfolio.repository;

import com.backend.portfolio.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuarios, Long> {}
