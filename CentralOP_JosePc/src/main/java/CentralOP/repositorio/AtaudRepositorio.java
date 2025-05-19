package CentralOP.repositorio;

import CentralOP.entidades.Ataud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AtaudRepositorio extends JpaRepository<Ataud.Integer> {
}
