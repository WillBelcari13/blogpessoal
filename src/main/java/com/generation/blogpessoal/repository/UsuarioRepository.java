package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

   //public Optional<Usuario> findByUsuario(String usuario);
    Optional<Usuario> findByUsuario(@Param("usuario") String usuario);

}
