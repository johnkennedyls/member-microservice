package co.edu.icesi.membermicroservice.service;

import co.edu.icesi.membermicroservice.model.Miembro;
import co.edu.icesi.membermicroservice.repository.MiembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiembroService {

    @Autowired
    private MiembroRepository miembroRepository;

    public Miembro registrarMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }

    public List<Miembro> obtenerTodosMiembros() {
        return miembroRepository.findAll();
    }

    public Miembro actualizarMiembro(Long id, Miembro miembroActualizado) {
        Miembro miembroExistente = miembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Miembro no encontrado"));

        miembroExistente.setNombre(miembroActualizado.getNombre());
        miembroExistente.setEmail(miembroActualizado.getEmail());
        miembroExistente.setMembresia(miembroActualizado.getMembresia());
        miembroExistente.setHistorialClases(miembroActualizado.getHistorialClases());
        return miembroRepository.save(miembroExistente);
    }

    public void eliminarMiembro(Long id) {
        miembroRepository.deleteById(id);
    }
}
