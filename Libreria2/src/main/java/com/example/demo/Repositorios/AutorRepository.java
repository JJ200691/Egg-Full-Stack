package com.example.demo.Repositorios;

import com.example.demo.Entidades.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String> {

    @Query("SELECT a FROM Autor a WHERE a.id = :id")
    public List<Autor> buscarLibroPorId(@Param("id") String id);

}
