package com.example.demo.Repositorios;

import com.example.demo.Entidades.Editorial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, String> {

    @Query("SELECT e FROM Editorial e WHERE e.id = :id")
    public List<Editorial> buscarLibroPorId(@Param("id") String id);

}
