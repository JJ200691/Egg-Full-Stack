package com.example.demo.Repositorios;

import com.example.demo.Entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String> {

    @Query("SELECT l FROM Libro l WHERE l.id = :id")
    public List<Libro> buscarLibroPorId(@Param("id") String id);

}
