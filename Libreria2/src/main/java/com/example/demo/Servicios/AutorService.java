package com.example.demo.Servicios;

import com.example.demo.Entidades.Autor;
import com.example.demo.Excepciones.ServiceException;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repositorios.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Transactional
    public Autor altaAutor(String nombre) throws ServiceException {

        validacion(nombre);

        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);

        autorRepository.save(autor);
        return autor;

    }

    @Transactional
    public Autor modificarAutor(String id, String nombre) throws ServiceException {

        validacion(nombre);

        Optional<Autor> resp = autorRepository.findById(id);
        if (resp.isPresent()) {
            Autor autor = resp.get();
            autor.setNombre(nombre);

            autorRepository.save(autor);
            return autor;
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public void bajaAutor(String id) throws ServiceException {

        Optional<Autor> resp = autorRepository.findById(id);
        if (resp.isPresent()) {
            Autor autor = resp.get();
            autor.setAlta(false);

            autorRepository.delete(autor);
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public List<Autor> listarAutores() {

        List<Autor> lista = autorRepository.findAll();
        return lista;
    }

    private void validacion(String nombre) throws ServiceException {

        if (nombre.isEmpty()) {
            throw new ServiceException("El nombre no puede estar vacío");
        }
    }

}
