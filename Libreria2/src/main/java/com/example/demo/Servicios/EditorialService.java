package com.example.demo.Servicios;

import com.example.demo.Entidades.Editorial;
import com.example.demo.Excepciones.ServiceException;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repositorios.EditorialRepository;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    public Editorial altaEditorial(String nombre) throws ServiceException {

        validacion(nombre);

        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);

        editorialRepository.save(editorial);
        return editorial;

    }

    @Transactional
    public Editorial modificarEditorial(String id, String nombre) throws ServiceException {

        validacion(nombre);

        Optional<Editorial> resp = editorialRepository.findById(id);
        if (resp.isPresent()) {
            Editorial editorial = resp.get();
            editorial.setNombre(nombre);

            editorialRepository.save(editorial);
            return editorial;
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public void bajaEditorial(String id) throws ServiceException {

        Optional<Editorial> resp = editorialRepository.findById(id);
        if (resp.isPresent()) {
            Editorial editorial = resp.get();
            editorial.setAlta(false);

            editorialRepository.delete(editorial);
        } else {
            throw new ServiceException("El ID ingresado no existe");
        }

    }

    @Transactional
    public List<Editorial> listarEditoriales() {

        List<Editorial> lista = editorialRepository.findAll();
        return lista;

    }

    private void validacion(String nombre) throws ServiceException {

        if (nombre.isEmpty()) {
            throw new ServiceException("El nombre no puedo estar vacío");
        }
    }

}
