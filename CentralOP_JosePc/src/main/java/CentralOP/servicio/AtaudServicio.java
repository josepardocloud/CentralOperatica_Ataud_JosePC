package CentralOP.servicio;

import CentralOP.entidades.Ataud;
import CentralOP.repositorio.AtaudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  java.util.List;
@Service
public class AtaudServicio {

    @Autowired
    private AtaudRepositorio ataudRepositorio;

    public List<Ataud> listarAtaud() {

        return ataudRepositorio.findAll();
    }

    public Ataud agregarAtauda(Ataud ataud) {

        return AtaudRepositorio.save(ataud);
    }

    public Ataud editarAtaud(Integer IdAtaud) {

        return AtaudRepositorio.findById(IdAtaud).get();
    }

    public Ataud actualizarAtaud(Ataud ataud) {

        return AtaudRepositorio.save(ataud);
    }

    public void eliminarAtaud(Integer IdAtaud) {

        AtaudRepositorio.deleteById(IdAtaud);
    }
}
