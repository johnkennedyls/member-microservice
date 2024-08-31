package co.edu.icesi.membermicroservice.repository;

import co.edu.icesi.membermicroservice.model.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Long> {
}
