package jlpc.repositorio;

import jlpc.entidades.Ataud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtaudRepositorio extends JpaRepository<Ataud, Integer> {
}

