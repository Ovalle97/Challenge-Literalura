package com.aluralatam.Literalura.repository;

import com.aluralatam.Literalura.model.Autor;
import com.aluralatam.Literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fecha_nacimiento <= :anio AND a.fecha_deceso >= :anio")
    List<Autor> listaAutoresVivosPorAnio(Integer anio);
}
