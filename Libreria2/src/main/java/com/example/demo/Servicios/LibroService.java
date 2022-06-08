package com.example.demo.Servicios;

import com.example.demo.Entidades.Libro;
import com.example.demo.Excepciones.ServiceException;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repositorios.LibroRepository;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Transactional
    public Libro altaLibro(String isbn, String titulo, Integer anio, Integer ejemplares) throws ServiceException {

        validacion(isbn, titulo, anio);

        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAlta(true);

        libroRepository.save(libro);
        return libro;

    }

    @Transactional
    public Libro modificarLibro(String id, String isbn, String titulo, Integer anio, Integer ejemplares) throws ServiceException {

        validacion(isbn, titulo, anio);

        Optional<Libro> resp = libroRepository.findById(id);
        if (resp.isPresent()) {
            Libro libro = resp.get();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);

            libroRepository.save(libro);
            return libro;
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public void bajaLibro(String id) throws ServiceException {

        Optional<Libro> resp = libroRepository.findById(id);
        if (resp.isPresent()) {
            Libro libro = resp.get();
            libro.setAlta(false);

            libroRepository.delete(libro);
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public List<Libro> listarLibros() {

        List<Libro> lista = libroRepository.findAll();
        return lista;

    }

    private void validacion(String isbn, String titulo, Integer anio) throws ServiceException {

        if (isbn.isEmpty() || isbn.length() < 13) {
            throw new ServiceException("El ISBN no puede contener menos de 13 dígitos o estar vacío");
        }

        if (titulo.isEmpty()) {
            throw new ServiceException("El titulo no puede estar vacío");
        }

        if (anio.toString().length() < 4 || anio.toString().isEmpty()) {
            throw new ServiceException("El año no puede estar vacío o contener menos de 4 digitos");
        }

    }

}
