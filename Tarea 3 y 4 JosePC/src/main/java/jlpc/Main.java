package jlpc;

import jlpc.entidades.Ataud;
import jlpc.repositorio.AtaudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private AtaudRepositorio ataudRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Creamos un objeto Ataud sin ID (se genera automáticamente)
        Ataud ataud = new Ataud(null, "Premium Caoba", "Caoba", "2.50m x 0.70m", 1500.0);

        // Guardamos en la base de datos
        ataudRepositorio.save(ataud);
    }
}