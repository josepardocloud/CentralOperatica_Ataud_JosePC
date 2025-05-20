package jlpc.servicio;

import jlpc.entidades.Ataud;
import jlpc.repositorio.AtaudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtaudServicio {

    @Autowired
    private AtaudRepositorio ataudRepositorio;

    public List<Ataud> listarAtaud() {
        return ataudRepositorio.findAll();
    }

    public Ataud agregarAtaud(Ataud ataud) {
        return ataudRepositorio.save(ataud);
    }

    public Optional<Ataud> editarAtaud(Integer idAtaud) {
        return ataudRepositorio.findById(idAtaud);
    }

    public Ataud actualizarAtaud(Ataud ataud) {
        return ataudRepositorio.save(ataud);
    }

    public void eliminarAtaud(Integer idAtaud) {
        ataudRepositorio.deleteById(idAtaud);
    }
}