package jlpc.controlador;

import jlpc.servicio.AtaudServicio;
import jlpc.entidades.Ataud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ataudes")
public class AtaudControlador {

    @Autowired
    private AtaudServicio ataudServicio;

    @GetMapping
    public List<Ataud> index() {
        return ataudServicio.listarAtaud();
    }
}
